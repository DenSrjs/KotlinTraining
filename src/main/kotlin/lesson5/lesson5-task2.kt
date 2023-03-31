package lesson5

fun main() {
    val year = 2023

    print("Введите год рождения: ")
    val yearOfBirth = readln().toInt()

    val calcAge = year - yearOfBirth

    if (calcAge >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")
    else println("Доступ закрыт")
}

const val AGE_OF_MAJORITY = 18