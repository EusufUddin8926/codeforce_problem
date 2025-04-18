package com.example.codeforceproblem.codeforce

fun main(){

    var input = readln().toInt()
    var count = 0

    if(input >= 5){
        count  += input / 5
        input -= (5*count)
    }
    if(input >= 4){
        count  += input / 4
        input -= (4*count)
    }
    if(input >= 3){
        count  += input / 3
        input -= (3*count)
    }
    if(input >= 2){
        count  += input / 2
        input -= (2*count)
    }

    if(input == 1){
        count++
    }
    println(count)
}