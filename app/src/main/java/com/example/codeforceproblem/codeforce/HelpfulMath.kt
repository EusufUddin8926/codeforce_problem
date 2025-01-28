package com.example.codeforceproblem.codeforce

fun main(){
    val n = readln()
    var tempSize = 0
    var output = ""
    val mList: MutableList<Int> = mutableListOf()

    for(i in 0 until n.length){
        if(n[i].isDigit()){
            mList.add(n[i].digitToInt())
        }
    }
    tempSize = mList.size

    for(i in 1 until tempSize){
        val key = mList[i]
        var j = i-1

        while(j>=0 && mList[j]>key){
            mList[j+1] = mList[j]
            j--
        }
        mList[j+1] = key
    }

    for(i in 0 until mList.size){
        output = output +"+"+ mList[i]
    }
    println(output.replaceFirst("+", ""))

}