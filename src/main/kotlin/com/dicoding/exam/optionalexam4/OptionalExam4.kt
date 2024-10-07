package com.dicoding.exam.optionalexam4

// TODO
fun getMiddleCharacters(string: String): String {
    val length = string.length
    val middleIndex = length / 2

    return if (length % 2 == 0) {
        string.substring(middleIndex - 1, middleIndex + 1)
    } else {
        string[middleIndex].toString()
    }
}