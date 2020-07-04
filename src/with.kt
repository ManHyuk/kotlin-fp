import model.Person

fun main(args: Array<String>) {
    val person = Person("fp", 30)
    val result = with(person) {
        age = 10
        name = "ddd"
        this
    }

    print(result)
}