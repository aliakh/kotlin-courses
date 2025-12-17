package tasks

import contributors.*
import kotlinx.coroutines.*

@OptIn(DelicateCoroutinesApi::class)
suspend fun loadContributorsNotCancellable(service: GitHubService, req: RequestData): List<User> {
    val repos = service
        .getOrgRepos(req.org)
        .also { logRepos(req, it) }
        .bodyList()

    return repos.map { repo ->
        GlobalScope.async {
            log.info("start coroutine to read from ${repo.name}")
            delay(3000)

            service
                .getRepoContributors(req.org, repo.name)
                .also { logUsers(repo, it) }
                .bodyList()
        }
    }
        .awaitAll()
        .also { log.info("all coroutines finished") }
        .flatten()
        .aggregate()
}