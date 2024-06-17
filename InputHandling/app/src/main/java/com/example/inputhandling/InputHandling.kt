package com.example.inputhandling

fun main(){
    var inputNumber = 0
    println("Enter the number:")
    var inputString = readln()
    inputNumber = inputString.toInt()
    val multiplier = 5
    println("The result is: " + multiplier * inputNumber)

}
