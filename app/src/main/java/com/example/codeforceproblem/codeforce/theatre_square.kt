package com.example.codeforceproblem.codeforce

fun main(){
    val (n, m, a) = readln().split(" ").map { it.toInt() }
    val result : Long


    var na = (n/a)
    if(n%a!=0)
        na++


    var ma = (m/a)
    if(m%a!=0)
       ma++

    result = (na*ma).toLong()


    print(result)

}