package com.example.codeforceproblem.codeforce

import kotlin.math.abs

fun main() {
    var row = 0
    var col = 0

    for (i in 0 until 5) {
        val inputLine = readln()
        val rowValues = inputLine.split(" ").map { it.toInt() }
        for (j in 0 until 5) {
            if (rowValues[j] == 1) {
                row = i + 1
                col = j + 1
                break
            }
        }
    }

    val moves = abs(row - 3) + abs(col - 3)
    println(moves)
}