package com.example.codeforceproblem.codeforce

fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val scores = readln().split(" ").map { it.toInt() }

    val kthPlaceScore = scores[k - 1]
    var advancingParticipants = 0

    for (i in 0 until n) {
        if (scores[i] >= kthPlaceScore && scores[i] > 0) {
            advancingParticipants++
        } else {
            break
        }
    }

    print(advancingParticipants)
}