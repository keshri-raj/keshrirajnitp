fun main(){
    val (a,b) = input()
    val array = input()
    println("$a $b $array")

}

fun input(): List<Int?>{
    val arr = readLine()!!.split(" ").map{ it.toInt()}.toList()
    return arr
}
