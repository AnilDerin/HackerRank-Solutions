package com.anilderinbay.hackerrank.c2_simple_array_sum

fun main() {
    simpleArraySum(arrayOf(2, 3, 4, 5, 6))
}

fun simpleArraySum(ar: Array<Int>): Int {
    // Write your code here
    var sum = 0

    for (e in ar) {
        sum += e
    }
    println(sum)

    return sum
}