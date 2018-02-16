class Blocxain {
    private val xain = mutableListOf<String>()

    fun add(data: String) {
        xain.add(data)
        xain.add(xain.hashCode().toString())
    }

    fun check() : Boolean {
        val tmpXain = mutableListOf<String>()

        var idx = 0

        while (idx <= xain.size - 1) {
            tmpXain.add(xain[idx])
            if (xain[idx + 1] != tmpXain.hashCode().toString()) {
                return false
            }
            tmpXain.add(xain[idx + 1])
            idx += 2
        }
        return true
    }

    fun get() : List<String> {
        return xain.filterIndexed { idx, _ -> ( idx % 2 == 0 )}.toList()
    }
}