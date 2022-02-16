package com.anilderinbay.hackerrank.c3_a_very_big_sum

fun main() {
    aVeryBigSum(arrayOf(1000000001, 1000000002, 1000000003, 1000000004, 1000000005))
}

fun aVeryBigSum(ar: Array<Long>): Long {
    // Write your code here

    var sum = 0.0
    for (e in ar) {
        sum += e
    }

    return sum.toLong()
}
