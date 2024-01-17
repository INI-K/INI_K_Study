import edu.Person as User
import kotlin.math.PI
import kotlin.math.abs

fun main(args: Array<String>) {
    val intro: String ="안녕하세요!"
    val num : Int = 20

    val user1 = User("김태환", 34)
    val user2 = Person("김태환2","Kildong")

    println(user1.name)
    println(user1.age)

    println(user2.id)
    println(user2.name)

    println(PI)
    println(abs(-12.6))

    println("intro: $intro, num: $num")
}
class Person(val id: String, val name: String)