package com.example.codeforceproblem.stack

fun main(){

    val stack = StackExtended(6)
    stack.push(1)
    stack.push(2)
    stack.push(3)
    stack.push(4)
    stack.push(5)
    stack.push(3)



    stack.popElement()
}

class StackExtended(mSize : Int){
    private val array = IntArray(mSize)
    private var top = -1
    private var size = 0

    init {
        size = mSize
        top = -1
    }

    fun popElement(){
        if(top == -1){
            println("Stack Underflow")
            return
        }

        while (top != -1){
            println(array[top])
            top--
        }
    }


    fun push(element : Int){
        if(top == size - 1){
            println("Stack Overflow")
            return
        }
        array[++top] = element
    }

    fun pop(){
        if(top == -1){
            println("Stack Underflow")
            return
        }
        array[top--]
    }

    fun peek() : Int{
        if(top == -1){
            println("Stack Underflow")
            return -1
        }
       return array[top]
    }

    fun isEmpty() : Boolean{
        return top == -1
    }

    fun isFull(): Boolean{
        return top == size - 1
    }

    fun printStackTrace(){
        for(i in 0..top){
            println(array[i])
        }

        println("????????????????????????????????")
    }
}