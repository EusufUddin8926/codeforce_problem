package com.example.codeforceproblem.stack

fun main() {

    val stack = Stack(5)
    stack.push(1)
    stack.push(2)
    stack.push(3)
    stack.push(4)

    stack.printStackTrace()

    println("////////////////////////////////")

    stack.pop()
    stack.pop()
    stack.pop()

    stack.printStackTrace()

    println("////////////////////////////////")

    println(stack.isEmpty())
    println(stack.isFull())

    println("////////////////////////////////")

    stack.peek()

    stack.printStackTrace()

    println("////////////////////////////////")

    stack.push(5)
    stack.push(6)
    stack.push(7)

    stack.printStackTrace()

    println("////////////////////////////////")
    stack.pop()
    stack.pop()
    stack.pop()
    stack.pop()
    stack.pop()
    stack.pop()

    stack.printStackTrace()

}


class Stack(mSize: Int) {

    private val array: IntArray = IntArray(mSize)
    private var top = -1
    private var size = 0

    init {
        size = mSize
        top = -1
    }

    fun push(element: Int) {
        if (top == size - 1) {
            println("Stack Overflow")
            return
        }
        array[++top] = element
    }

    fun pop(): Int {
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

    fun printStackTrace() {
        for (i in 0..top) {
            println(array[i])
        }
    }

}