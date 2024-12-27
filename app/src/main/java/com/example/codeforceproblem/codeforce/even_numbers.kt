package com.example.codeforceproblem.codeforce


fun main() {
    val n = readln().toInt()
    checkEven(n)
}

fun checkEven(n: Int) {
    if (n % 2 == 0 && n > 2) {
        print("YES")
        return
    }
    print("NO")
    return
}