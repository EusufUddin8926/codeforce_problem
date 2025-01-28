package com.example.codeforceproblem.codeforce

fun main(){

    val input = readln()

    if(!input[0].isUpperCase()){
        println(input.replaceFirstChar { it.uppercase() })
    }else{
        println(input)
    }
}