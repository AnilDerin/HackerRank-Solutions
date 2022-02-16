package com.anilderinbay.hackerrank.c6_staircase


fun main() {
    staircase(6)
}

fun staircase(n: Int): Unit {
    for (x in 1..n) {
        for (y in 1..n) {
            val data = if ((x + y) > n) '#' else ' '
            print(data)
        }
        println()
    }
}