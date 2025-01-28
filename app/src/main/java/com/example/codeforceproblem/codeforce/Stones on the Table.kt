package com.example.codeforceproblem.codeforce

fun main() {
    val n = readln().toInt()
    val k = readln()
    var temp = k[0]
    var output = 0

    if(n == k.length){
        for(i in 1 until k.length){
            if(temp == k[i]){
                output++
            }
            temp = k[i]
        }
    }
    println(output)

}