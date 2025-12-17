package tasks

import contributors.*
import kotlinx.coroutines.*

suspend fun loadContributorsConcurrent(service: GitHubService, req: RequestData): List<User> = coroutineScope { // The scope inherits the context from the outer scope
    val repos = service
        .getOrgRepos(req.org)
        .also { logRepos(req, it) }
        .bodyList()

    return@coroutineScope repos.map { repo ->
        async { // The nested coroutine started with the inherited context
            log.info("start coroutine to read from ${repo.name}")
            // delay(3000)

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