package com.example.codeforceproblem.codeforce

fun main(){
    var (n, m) = readln().split(" ").map { it.toInt() }

    var count = 0

    while (m >= n){
        m *= 2
        n *= 3
        count++
    }

    println(count)


}