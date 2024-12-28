package com.example.codeforceproblem.codeforce

import kotlin.math.max

fun main() {
    var n = readln().toInt()
    var count: Int
    var result = 0
    while (n > 0) {
        count = 0
        val inputLine = readLine()
        if (inputLine != null) {
            val numbers = inputLine.split(" ")
            for (i in numbers.indices) {
                val input = numbers[i].toIntOrNull()
                if (input == 1) {
                    count++
                }
                if (count >= 2 && i == 2) {
                    result += 1
                }
            }

        }
        n--
    }
    println(result)
}