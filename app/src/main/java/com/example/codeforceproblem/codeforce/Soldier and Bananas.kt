package com.example.codeforceproblem.codeforce

import kotlin.math.abs

fun main(){
    val (k,n,w) = readln().split(" ").map { it.toInt() }
    var total = 0

    for(i in 1 ..  w){
        total += (k*i)
    }

    if(n >= total){
        println(0)
        return
    }

    println(abs(n-total))
}