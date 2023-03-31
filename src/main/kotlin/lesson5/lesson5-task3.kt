package lesson5

fun main() {
    val numberOne = 56
    val numberTwo = 87

    println("Введите два целых числа от 1 до 100")

    print("Введите первое число: ")
    val inputNumberOne = readln().toInt()

    print("Введите второе число: ")
    val inputNumberTwo = readln().toInt()

    println("Ваши числа $inputNumberOne, $inputNumberTwo")

    if ((inputNumberOne == numberOne || inputNumberOne == numberTwo)
        && (inputNumberTwo == numberOne || inputNumberTwo == numberTwo)
    ) println("Поздравляем! Вы выиграли главный приз!")
    else if ((inputNumberOne == numberOne || inputNumberOne == numberTwo)
        || (inputNumberTwo == numberOne || inputNumberTwo == numberTwo)
    ) println("Вы выиграли утешительный приз")
    else println("Неудача! Крутите барабан!")

    println("Победные числа $numberOne и $numberTwo")
}
