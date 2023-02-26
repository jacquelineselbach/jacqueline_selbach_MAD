fun main() {

    val generatedNumber = generateNumber()

    var nCorrect = 0
    var mCorrect = 0

    do {
        print("Enter a 4-digit number with no repeating digits: ")
        val guessedNumber = readLine() ?: ""

        nCorrect = countCorrectDigits(guessedNumber, generatedNumber)
        mCorrect = countCorrectPositions(guessedNumber, generatedNumber)
        println("$nCorrect:$mCorrect")

    } while (mCorrect < 4)

    println("Congratulations, you have guessed the number!")
}

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




