package com.example.numbers_guessing_game

fun main() {

    val generatedNumber = generateNumber()

    var nCorrect = 0
    var mCorrect = 0

    do {
        print("Enter a 4-digit number: ")
        val guessedNumber = readLine() ?: "1234"

        nCorrect = countCorrectDigits(guessedNumber, generatedNumber)
        mCorrect = countCorrectPositions(guessedNumber, generatedNumber)
        println("$nCorrect:$mCorrect")

    } while (mCorrect < 4)

    println("Congratulations, you have guessed the number!")
}




