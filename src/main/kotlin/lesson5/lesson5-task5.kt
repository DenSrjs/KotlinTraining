package lesson5

fun main() {
    println("Введите два целых числа от 1 до 100")

    print("Введите первое число: ")
    val inputNumberOne: Byte = readlnOrNull().toString().toByte()

    print("Введите второе число: ")
    val inputNumberTwo: Byte = readlnOrNull().toString().toByte()

    val numberOne: Byte = (1 .. 100).random().toByte()
    val numberTwo: Byte = (1 .. 100).random().toByte()

    println("Ваши числа $inputNumberOne, $inputNumberTwo")

    if ((inputNumberOne == numberOne || inputNumberOne == numberTwo)
        && (inputNumberTwo == numberOne || inputNumberTwo == numberTwo)) println( "Поздравляем! Вы выиграли главный приз!")
    else if((inputNumberOne == numberOne || inputNumberOne == numberTwo)
        || (inputNumberTwo == numberOne || inputNumberTwo == numberTwo)) println("Вы выиграли утешительный приз")
    else println("Неудача! Крутите барабан!")

    println("Победные числа $numberOne и $numberTwo")
}
