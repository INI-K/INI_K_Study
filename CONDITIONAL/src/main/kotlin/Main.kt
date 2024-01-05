fun main(args: Array<String>) {
    println(maxBy(1,2))
    println(maxBy2(2,3))
    checkSum(2)
    checkSum2(10)
    checkSum2(90)
}
fun maxBy(a : Int , b : Int) : Int{
    if(a>b){
        return a
    }else{
        return b
    }
}

fun maxBy2(a : Int, b : Int) = if(a > b) a else b

fun checkSum(score : Int){
    when(score){
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3")
    }
}

fun checkSum2(score : Int){
    var b = when(score){
        1 -> 1
        2 -> 2
        else ->3
    }
    when(score){
        in 90..100 -> println("잘했음")
        in 10..80 -> println("나쁘지 않음")
        else -> println("나쁨")
    }
}
