package br.com.mateo.controller

import br.com.mateo.converters.NumberConverter
import br.com.mateo.exceptions.UnsuportedMathOperationException
import br.com.mateo.math.SampleMath
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MathController {

    private val math: SampleMath = SampleMath();

    @RequestMapping(value = ["/sum/{numOne}/{numTwo}"])
    fun sum(
        @PathVariable(value = "numOne") numOne: String?,
        @PathVariable(value = "numTwo") numTwo: String?
    ): Double {
        if(!NumberConverter.isNumeric(numOne) || !NumberConverter.isNumeric(numTwo)) throw UnsuportedMathOperationException("Please set a numeric value!");
        return math.sum(NumberConverter.convertDouble(numOne), NumberConverter.convertDouble(numTwo));
    }

    @RequestMapping(value = ["/multiplication/{numOne}/{numTwo}"])
    fun multiplication(
        @PathVariable(value = "numOne") numOne: String?,
        @PathVariable(value = "numTwo") numTwo: String?
    ): Double {
        if(!NumberConverter.isNumeric(numOne) || !NumberConverter.isNumeric(numTwo)) throw UnsuportedMathOperationException("Please set a numeric value!");
        return math.multiplication(NumberConverter.convertDouble(numOne), NumberConverter.convertDouble(numTwo));
    }

    @RequestMapping(value = ["/subtraction/{numOne}/{numTwo}"])
    fun subtraction(
        @PathVariable(value = "numOne") numOne: String?,
        @PathVariable(value = "numTwo") numTwo: String?
    ): Double {
        if(!NumberConverter.isNumeric(numOne) || !NumberConverter.isNumeric(numTwo)) throw UnsuportedMathOperationException("Please set a numeric value!");
        return math.subtraction(NumberConverter.convertDouble(numOne), NumberConverter.convertDouble(numTwo));
    }

    @RequestMapping(value = ["/division/{numOne}/{numTwo}"])
    fun division(
        @PathVariable(value = "numOne") numOne: String?,
        @PathVariable(value = "numTwo") numTwo: String?
    ): Double {
        if(!NumberConverter.isNumeric(numOne) || !NumberConverter.isNumeric(numTwo)) throw UnsuportedMathOperationException("Please set a numeric value!");
        return math.division(NumberConverter.convertDouble(numOne), NumberConverter.convertDouble(numTwo));
    }

    @RequestMapping(value = ["/mean/{numOne}/{numTwo}"])
    fun mean(
        @PathVariable(value = "numOne") numOne: String?,
        @PathVariable(value = "numTwo") numTwo: String?
    ): Double {
        if(!NumberConverter.isNumeric(numOne) || !NumberConverter.isNumeric(numTwo)) throw UnsuportedMathOperationException("Please set a numeric value!");
        return math.mean(NumberConverter.convertDouble(numOne), NumberConverter.convertDouble(numTwo));
    }

    @RequestMapping(value = ["/squareRoot/{number}"])
    fun squareRoot(@PathVariable(value = "number") number: String?): Double {
        if(!NumberConverter.isNumeric(number)) throw UnsuportedMathOperationException("Please set a numeric value!");
        return math.squareRoot(NumberConverter.convertDouble(number));
    }
}