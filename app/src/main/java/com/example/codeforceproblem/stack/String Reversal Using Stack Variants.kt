package com.example.codeforceproblem.stack

fun main() {
    val stack = StackString(10)
    val input = readlnOrNull().toString()
    var i = 0
    while (i < input.length) {
        stack.pushElement(input[i])
        i++
    }

    println(stack.popElementAll())
}


class StackString(mSize: Int) {
    private val array = CharArray(mSize)
    var top = -1
    private var size = mSize

    fun pushElement(element: Char) {
        if (top == size - 1) {
            println("Stack Overflow")
            return
        }
        array[++top] = element
    }

    fun popElementAll(): String {
        var output = ""
        if (top == -1) {
            println("Stack Underflow")
            return ""
        }

        while (top != -1) {
            output += array[top]
            top--
        }
        return output
    }

}