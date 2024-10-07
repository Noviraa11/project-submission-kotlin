package com.dicoding.exam.exam2

// TODO 1
fun calculate(valueA: Int, valueB: Int, valueC: Int?): Int {
    val adjustedValueC = valueC ?: 50
    return valueA + (valueB - adjustedValueC)
}

// TODO 2
fun result(result: Int): String {
    return "Result is $result"
}