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
//    println("Who is this coffee for?")
//    val name = readln()
//    println("How many pieces of sugar do you want?")
//    val sugarCount = readln().toInt()
//
//    makeCoffee(sugarCount, name)

//    println("Enter number 1")
//    val num1 = readln().toDouble()
//    println("Enter number 2")
//    val num2 = readln().toDouble()
//
//    // val myResult = add(num1, num2)
//    val myResult = devide(num1, num2)
//    println("The result is $myResult")

    // Creating an Object/instance of the class Dog
//    var daisy = Dog("Daisy", "Dwarf poodle", 1)
//    println("${daisy.name} is a ${daisy.breed} and is ${daisy.age} years old")
//    daisy.age = 2
//    println("A year has passed")
//    println("${daisy.name} is a ${daisy.breed} and is ${daisy.age} years old")


//    val coffeeForDenis = coffeeDetails(3, "Denis", "Venti", 2)
//    makeCoffee(coffeeForDenis)

    // Immutable list - you cannot add items after the initialization
    // val shoppingList = listOf("Processor", "RAM", "Graphics Card", "SSD")
    // mutable list - you can add items later and modify
    val shoppingList = mutableListOf("Processor", "RAM", "Graphics Card RTX 3060", "SSD")

    // adding items to lists
    shoppingList.add("Cooling system")
    println(shoppingList)
    shoppingList.remove("Graphics Card RTX 3060")
    println(shoppingList)
    shoppingList.add("Graphics Card RTX 4090")
    println(shoppingList)
    shoppingList.removeAt(2)
    println(shoppingList)
    shoppingList.removeAt(1)
    println(shoppingList)
    shoppingList.add(2, "RAM")
    println(shoppingList)
    println(shoppingList[2])

    shoppingList[3] = "Graphics Card RX 7800XT"
    println(shoppingList)
    shoppingList.set(1, "Water Cooling")
    println(shoppingList)
    val hasRam = shoppingList.contains("RAM")
    println(hasRam)

    for(item in shoppingList){
        println(item)
        if(item == "RAM"){
            shoppingList.removeLast()
            break
        }
    }
    println(shoppingList)

}

/*
data class coffeeDetails(
    val sugarCount: Int,
    val name: String,
    val size: String,
    val creamAmount: Int
)

fun devide(num1 : Double, num2: Double): Double{
    return num1 / num2
}

fun add(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun askCoffeeDetails(){
    println("Who is this coffee for?")
    val name = readln()
    println("How many pieces of sugar do you want?")
    val sugarCount = readln().toInt()

    // makeCoffee(sugarCount, name)
}

// Define Function
fun makeCoffee(coffeeDetails: coffeeDetails){
    if(coffeeDetails.sugarCount == 1){
        println("Coffee with ${coffeeDetails.sugarCount} spoon of sugar " +
                "for ${coffeeDetails.name} + and cream : ${coffeeDetails.creamAmount}")
    }else if(coffeeDetails.sugarCount == 0){
        println("Coffee with no sugar for ${coffeeDetails.name}" +
                "+ and cream : ${coffeeDetails.creamAmount}")
    }else{
        println("Coffee with ${coffeeDetails.sugarCount} spoons of sugar " +
                "for ${coffeeDetails.name} + and cream : ${coffeeDetails.creamAmount}")
    }


}

 */
