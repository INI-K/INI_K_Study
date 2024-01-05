fun main(args: Array<String>) {
    helloPrint()
    println(add(12,32))
    stringPrint()
}
fun helloPrint(): Unit {
    println("Hello World")
}

fun print(string: String): String{
    return string
}

fun add(a : Int, b:Int) : Int{
    return a+b
}

//val Vs var
fun variableTest(){
    val a = 10
    var b = 20
}

//StringPrint
fun stringPrint(){
    val name = "태환"
    println("My name is $name")
}
