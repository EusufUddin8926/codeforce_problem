package com.example.codeforceproblem.codeforce

import android.util.Log.println


fun main(){
    val n = readln()
    var output = ""

    for(i in 0 until n.length){
       if(n[i].toString().toLowerCase() == "a" || n[i].toString().toLowerCase() == "e" || n[i].toString().toLowerCase() == "i" || n[i].toString().toLowerCase() == "o" || n[i].toString().toLowerCase() == "u" || n[i].toString().toLowerCase() == "y"){
           continue
       }
        output += "." + n[i].toString().toLowerCase()
    }
    
    println(output)
}