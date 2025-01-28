package com.example.codeforceproblem.codeforce

fun main(){
    val n = readln()
    val set = mutableSetOf<Char>()

    for(i in 0 until n.length){
        set.add(n[i])
    }
    if(set.size % 2 == 0){
        println("CHAT WITH HER!")
    }else{
        println("IGNORE HIM!")
    }
}