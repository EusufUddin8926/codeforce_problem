package com.example.codeforceproblem.stack

fun main(){

    val stack = StackCapacity(3)
    stack.push(1)
    stack.push(2)
    stack.push(3)

    print("Stack size: ${stack.stackSize()}\n")
    stack.printAll()
    println("Push another value and check if the stack is full or not!")
    println(if(stack.isFull()) "Stack is full!" else "Stack is not full!")
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())


    stack.push(10)
    stack.push(20)
    println("\n")

    print("Stack size: ${stack.stackSize()}\n")
    stack.printAll()
    println("Check the said stack is full or not!")
    println(if(stack.isFull()) "Stack is full!" else "Stack is not full!")
}

class StackCapacity(mSize: Int){

    private val array = IntArray(mSize)
    private var size = mSize
    private var top = -1

    fun push(element: Int) {
        if (top == size - 1) {
            println("Stack Overflow")
            return
        }
        array[++top] = element

    }

    fun stackSize(): Int {
        return size
    }

    fun pop() : Int{
        if (top == -1) {
            println("Stack Underflow")
            return -1
        }
      return array[top--]
    }

    fun peek(): Int {
        if (top == -1) {
            println("Stack Underflow")
            return -1
        }
        return array[top]

    }

    fun isEmpty(): Boolean {
        return top == -1
    }

    fun isFull(): Boolean {
        return top == size - 1
    }

    fun printAll() {
       for (i in 0 ..  top){
           println(array[i])
       }
    }
}