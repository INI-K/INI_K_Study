
fun main(args: Array<String>) {
//    val number = 10
//    var language = "Korean"
//    val secondNumber: Int = 20
//    language = "Engilsh"
//
//    println("number: $number")
//    println("language: $language")
//    println("secondNumber: $secondNumber")
//-----
//    var num: Double = 0.1
//
//    for(x in 0..999){
//        num += 0.1
//    }
//
//    println(num)
//    println("Byte min: " + Byte.MIN_VALUE + " max: " + Byte.MAX_VALUE)
//    println("Short min: " + Short.MIN_VALUE + " max: " + Short.MAX_VALUE)
//    println("Int min: " + Int.MIN_VALUE + " max: " + Int.MAX_VALUE)
//    println("Long min: " + Long.MIN_VALUE + " max: " + Long.MAX_VALUE)
//    println("Float min: " + Float.MIN_VALUE + " max: " + Long.MAX_VALUE)
//    println("Double min : " + Double.MIN_VALUE + " max: " + Double.MAX_VALUE)
//---
    var str1: String? = "Hello Kotlin"
    str1 = null
    val len = if(str1 != null) str1.length else -1
    println("str1: $str1 length: ${len}")


    var str2: String? = "Hello Kotlin"
    str2 = null
    println("str2: $str2 length: ${str2?.length ?: -1}")

}