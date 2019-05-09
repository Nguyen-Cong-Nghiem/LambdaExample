fun main() {
    val list: MutableList<Int> = mutableListOf(1, 2, 3)
    list.stream().forEach{ println(it)}
    list.forEach{println(it)}
    list.forEach{if (it % 2 ==0) println(it)}

}

interface Fun1 {
    fun operation(x: Int, y: Int) : Int
}

interface Fun2 {
    fun sayMess(mess: String)
}

fun opera(x: Int, y: Int, fobj: Fun1): Int {
    return fobj.operation(x,y)
}