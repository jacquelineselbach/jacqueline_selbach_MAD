package com.example.numbers_guessing_game

import org.junit.Test

import org.junit.Assert.*

class NumbersGameTest {

    @Test
    fun testGeneratedNumberIs4Digits() {
        val generatedNumber = generateNumber()
        assertEquals(4, generatedNumber.length)
    }

    @Test
    fun testGeneratedNumberHasNoRepeatingDigits() {
        val generatedNumber = generateNumber()
        assertTrue(generatedNumber.toSet().size == 4)
    }

    @Test
    fun testGeneratedNumbersAreRandom() {
        val generatedNumber1 = generateNumber()
        val generatedNumber2 = generateNumber()
        assertTrue(generatedNumber1 != generatedNumber2)
    }

    @Test
    fun testCountCorrectDigitsAllCorrect() {
        val guess = "8576"
        val generatedNumber = "8576"
        val result = countCorrectDigits(guess, generatedNumber)
        assertEquals(4, result)
    }

    @Test
    fun testCountCorrectDigitsSomeCorrect() {
        val guess = "3586"
        val generatedNumber = "8576"
        val result = countCorrectDigits(guess, generatedNumber)
        assertEquals(3, result)
    }

    @Test
    fun testCountCorrectDigitsOneCorrect() {
        val guess = "5555"
        val generatedNumber = "8576"
        val result = countCorrectDigits(guess, generatedNumber)
        assertEquals(1, result)
    }

    @Test
    fun testCountCorrectDigitsNoneCorrect() {
        val guess = "1234"
        val generatedNumber = "8576"
        val result = countCorrectDigits(guess, generatedNumber)
        assertEquals(0, result)
    }

    @Test
    fun testCountCorrectPositionsAllCorrect() {
        val guess = "8576"
        val generatedNumber = "8576"
        val result = countCorrectPositions(guess, generatedNumber)
        assertEquals(4, result)
    }

    @Test
    fun testCountCorrectPositionsSomeCorrect() {
        val guess = "3586"
        val generatedNumber = "8576"
        val result = countCorrectPositions(guess, generatedNumber)
        assertEquals(2, result)
    }

    @Test
    fun testCountCorrectPositionsOneCorrect() {
        val guess = "1234"
        val generatedNumber = "8576"
        val result = countCorrectPositions(guess, generatedNumber)
        assertEquals(0, result)
    }

    @Test
    fun testCountCorrectPositionsNoneCorrect() {
        val guess = "5678"
        val generatedNumber = "8576"
        val result = countCorrectPositions(guess, generatedNumber)
        assertEquals(1, result)
    }
}