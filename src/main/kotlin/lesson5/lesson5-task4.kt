package lesson5

fun main() {
    print("Введите логин: ")
    val inputLogin = readln()

    val loginUser = "Batman"
    val passwordUser = "password"

    if (inputLogin == loginUser) {
        print("Введите пароль: ")
        when (readln()) {
            passwordUser -> println("Добро пожаловать")
            else -> println("Ошибка авторизации")
        }
    } else println("Вам необходимо зарегистрироваться")
}
