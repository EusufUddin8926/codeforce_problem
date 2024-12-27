package com.example.codeforceproblem.codeforce

fun main() {
    val n = readln().toInt()
    val words = Array(n) { "" }

    for (i in 0 until n) {
        val input = readln()
        words[i] = input
    }

    print(longWordsOptimization(words))
}

fun longWordsOptimization(words: Array<String>): String {
    var outputs = ""
    var count = 0

    for (i in words.indices) {
        if (words[i].length <= 10) {
            outputs += "${words[i]}\n"
            continue
        } else {
            for(j in words[i].indices){
                if (j == 0) {
                    outputs += "${words[i][j]}"
                } else {
                    if (j == words[i].length-1) {
                        outputs += "${count}${words[i][j]}\n"
                        count = 0
                    } else {
                        count++
                    }
                }
            }
        }


    }

    outputs = outputs.trim()
    return outputs
}