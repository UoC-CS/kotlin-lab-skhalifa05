package com.example.lab1
import java.util.*

class Calculator(num1: Double, num2: Double) {
    private val num1: Double
    private val num2: Double

    init {
        this.num1 = num1
        this.num2 = num2
    }

    fun add(): Double {
        return num1 + num2
    }

    fun subtract(): Double {
        return num1 - num2
    }

    fun multiply(): Double {
        return num1 * num2
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter first number: ")
    val num1 = scanner.nextDouble()

    print("Enter second number: ")
    val num2 = scanner.nextDouble()

    print("Enter operation (+, -, *): ")
    val operation = scanner.next()

    val calculator = Calculator(num1, num2)

    val result = when (operation) {
        "+" -> calculator.add()
        "-" -> calculator.subtract()
        "*" -> calculator.multiply()
        else -> {
            println("Invalid operation")
            return
        }
    }

    println("Result: $result")
}
