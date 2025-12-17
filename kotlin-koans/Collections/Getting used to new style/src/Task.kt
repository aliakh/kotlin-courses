fun doSomethingWithCollection(collection: Collection<String>): Collection<String>? {
    val groupsByLength = collection
        .groupBy { s -> s.length }

    val maximumGroupSize = groupsByLength.values
        .maxOfOrNull { group -> group.size }

    return groupsByLength.values
        .firstOrNull { group -> group.size == maximumGroupSize }
}
