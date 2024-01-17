fun main(args: Array<String>) {
    val inigay: Person = Person("inigay")
//    val inigay2: Person = null
    var inigayThree = Person("per",30)

    var tempOne = 1

    val fentaGay: Student = Student("FentaGay",20)
//    val fentaTwo: Student = Person("Fenta", 30)
    inigayThree = fentaGay

    println("출력 : " + inigayThree.name)
    println("출력 : " + inigayThree.age)
}

open class Person(
    val name: String,
    val age: Int? = null
)

class Student(name: String, age: Int) : Person(name,age)