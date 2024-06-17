package com.example.kotlinbasics

fun main(){

//    var myAge : Long = 35
//    println(myAge)
//    myAge = 365555555555555
//
//    println("Hellow World!")
//    println(myAge)
//
//    var pi = 3.14f
//    pi = 3.1415926535f
//
//    println(pi)
//    var age1 : UShort = 35u
//    println(age1)
//
//    var myTrue : Boolean = true
//    var myFalse : Boolean = false
//
//    println(myTrue || myFalse) // true
//    println(myTrue && myFalse) // false
//    println(!myTrue) // false
//
//    val myChar = '\u00AE'
//    println(myChar)
//
//    var name = ""
//    name = "Very long paragraphs can be stored inside of stings"
//    println(name.lowercase())
//    println(name.uppercase())
//    println(name + " Panjuta")
//
//    var firstName = "Hoshi"
//    var lastName = "Kwon"
//
//    println(firstName + " " + lastName)

    // comparison operators
    // greater than >
    // lower than <
    // greater equal >=
    // lower equal <=
    // equal ==
//    var age = 0
//    println("Please enter your age as a whole number")
//    var enteredValue = readln()
//    age = enteredValue.toInt()
//
//    // age = readln().toInt()
//
//    if(age >= 40){
//        println("You can not go into the club, Please go home")
//    }else if(age >= 18){
//        println("You can enter")
//    }else{
//        println("You are too young to go into the club")
//    }
//
//    var count = 0
//    while(count < 3){
//        println("count is $count")
//        count ++
//    }
//    println("Loop is done!")
//
//    var userInput = readln()
//    while(userInput == "1"){
//        println("while loop executed")
//        userInput = readln()
//    }
//    println("Loop is done!")
    // Call Function
    makeCoffee(0, "Jenny")
    makeCoffee(1, "Jimmy")
    makeCoffee(2, "Amy")
    makeCoffee(30, "Clair")
}

// Define Function
fun makeCoffee(sugarCount : Int, name: String){
    if(sugarCount == 1){
        println("Coffee with $sugarCount spoon of sugar for $name")
    }else if(sugarCount == 0){
        println("Coffee with no sugar for $name")
    }else{
        println("Coffee with $sugarCount spoons of sugar for $name")
    }

}
