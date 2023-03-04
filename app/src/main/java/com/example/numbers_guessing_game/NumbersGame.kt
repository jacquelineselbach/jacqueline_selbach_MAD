package com.example.numbers_guessing_game

fun generateNumber(): String {
    val digits = mutableListOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9')
    digits.shuffle()
    return digits.subList(0, 4).joinToString("")
}

fun countCorrectDigits(guess: String, generatedNumber: String): Int {
    val guessDigits = guess.toSet()
    val genDigits = generatedNumber.toSet()
    return guessDigits.intersect(genDigits).size
}

fun countCorrectPositions(guess: String, generatedNumber: String): Int {
    return guess.zip(generatedNumber).count { (g, n) -> g == n }
}



