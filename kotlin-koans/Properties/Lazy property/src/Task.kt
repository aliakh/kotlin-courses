class LazyProperty(val initializer: () -> Int) {
    var inited: Int? = null
    val lazy: Int
        get() {
            if (inited == null) {
                inited = initializer()
            }
            return inited!!
        }
}
