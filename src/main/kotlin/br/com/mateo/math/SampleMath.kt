package br.com.mateo.math

import kotlin.math.sqrt

class SampleMath {
    fun sum(numberOne: Double, numberTwo: Double):Double = numberOne + numberTwo;
    fun multiplication(numberOne: Double, numberTwo: Double):Double = numberOne * numberTwo;
    fun subtraction(numberOne: Double, numberTwo: Double):Double = numberOne - numberTwo;
    fun division(numberOne: Double, numberTwo: Double):Double = numberOne / numberTwo;
    fun mean(numberOne: Double, numberTwo: Double):Double = (numberOne + numberTwo)/2;
    fun squareRoot(number: Double):Double = sqrt(number);
}