package com.example.codeforceproblem.stack

fun main(){

    val size = 4
    val stack = StackVariants(size)
    var i = 1

    while (i <= size){
        println("Push Data $i")
        stack.push(i)
        i++
    }

    println("????????????????????????????????????")
    stack.popElement()

}

class StackVariants(mSize: Int){

    private val array = IntArray(mSize)
    private var size: Int  = mSize
    private var top = -1

    fun popElement(){
        if(top == -1){
            println("Stack is underflow")
            return
        }
        while (top != -1){
            println("Pop Data ${array[top]}")
            top--
        }
    }

    fun push(element: Int){
        if(top == size-1){
            println("Stack is Overflow")
            return
        }
        array[++top] = element
    }

    fun pop(){
        if (top ==-1){
            println("Stack is underflow")
            return
        }

        array[top--]
    }

    fun peek(){
        if(top == -1){
            println("Stack Underflow")
            return
        }
        array[top]
    }

    fun isEmpty(): Boolean{
        return  top == -1
    }

    fun isFull(): Boolean{
        return top == size-1
    }
}