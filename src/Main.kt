fun main(args: Array<String>) {
    val xain = Blocxain()
    xain.add("a")
    assert(xain.check())
    xain.add("b")
    assert(xain.check())
    xain.add("c")
    assert(xain.check())
    xain.get().also { println(it) }
}
