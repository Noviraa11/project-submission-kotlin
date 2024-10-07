package com.dicoding.exam.optionalexam3

// TODO
fun manipulateString(str: String, int: Int): String {
    val digits = str.filter { it.isDigit() }

    return if (digits.isNotEmpty()) {
        val number = digits.toInt()
        val multiplied = number * int
        str.replace(digits, "") + multiplied
    } else {
        str + int
    }
}
