package com.example.agecontrol

fun main(){
    var age = 0

    println("Enter your age as a whole number: ")
    age = readln().toInt()

    if(age in 18..39){
        println("You can enter the club.")
    }else if(age>=40){
        println("You cannot go into the club, please go home.")
    }else{
        println("Age not verified. Please contact support.")
    }
}