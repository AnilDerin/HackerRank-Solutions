package com.anilderinbay.hackerrank.c5_plus_minus

fun main() {
    plusMinus(arrayOf(-4, 3, -9, 0, 4, 1))
}

fun plusMinus(arr: Array<Int>): Unit {
    // Write your code here
    var positives = 0
    var negatives = 0
    var zeros = 0

    for (number in arr) {
        when {
            number > 0 -> positives += 1
            number < 0 -> negatives += 1
            else -> zeros += 1
        }
    }

    val size = arr.size.toDouble()
    println("%.6f".format(positives / size))
    println("%.6f".format(negatives / size))
    println("%.6f".format(zeros / size))
}


