package com.example.codeforceproblem.codeforce

fun main(){

    val nums : IntArray = intArrayOf(1,3,4,5,6)
    val target = 3

    println(binarySearch(nums, target))
}

fun binarySearch(nums : IntArray, target: Int) : Int{
    var low = 0
    var high = nums.size-1
    var mid = 0


    while(low <= high){
         mid = (low + high) / 2


        if(nums[mid] == target){
            return mid
        }

        if(nums[mid] > target){
            high = mid - 1
        }
        if(nums[mid] < target){
            low = mid + 1
        }
    }

    return low
}