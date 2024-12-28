package com.example.codeforceproblem.codeforce

fun main() {

    var n = readln().toInt()
    var x = 0
    while (n > 0) {
        val input = readLine()
        if (input.toString() == "++") {
            x += 1
        } else if (input.toString().equals("--")) {
            x -= 1
        }else{
            x = 0
        }
        n--
    }
    print(x.toString())
}