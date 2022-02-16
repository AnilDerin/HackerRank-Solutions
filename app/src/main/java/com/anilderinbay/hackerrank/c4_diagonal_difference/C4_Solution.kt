package com.anilderinbay.hackerrank.c4_diagonal_difference

import kotlin.math.abs


fun main() {
    val a: Array<Int> = arrayOf(1, 2, 3)
    val b: Array<Int> = arrayOf(4, 5, 6)
    val c: Array<Int> = arrayOf(9, 8, 9)
    val m: Array<Array<Int>> = arrayOf(a, b, c)

    println(diagonalDifference(m))
}


fun diagonalDifference(arr: Array<Array<Int>>): Int {
    // Write your code here
    var diagonal1 = 0
    var diagonal2 = 0
    val n = arr.size

    for (i in 0 until n) {
        diagonal1 += arr[i][i]
        diagonal2 += arr[i][n - i - 1]

    }
    return abs(diagonal1 - diagonal2)
}