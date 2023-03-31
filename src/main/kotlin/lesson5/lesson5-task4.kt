package lesson5

fun main() {
    print("Введите логин: ")
    val inputLogin: String = readlnOrNull().toString()

    val loginUser: String = "Batman"
    val passwordUser: String = "password"

    if (inputLogin == loginUser){
        print("Введите пароль: ")
        when(readlnOrNull().toString()){
            passwordUser -> println("Добро пожаловать")
            else -> println("Ошибка авторизации")
        }
    }
    else println("Вам необходимо зарегистрироваться")
}
