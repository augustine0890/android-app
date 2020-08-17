package com.example.helloworld

fun main(){
    var myName = "Augustine" // mutable variable
    myName = "Quy"
    val myFamilyName = "Nguyen" // immutable variable
    var myAge = 30 // type inference finds out the type from context
    println("Hello $myName $myFamilyName")

    /*
    This is multiple comment
    Integer TYPES: Byte (8 bit), Short (16 bit)
    Int (32 bit), Long (64 bit)
     */
    val myByte: Byte = 15
    val myShort: Short = 125
    val myInt: Int = 1234123412
    val myLong: Long = 12_039_812_487_120_39

    // Floating Point number Types: Float (32 bit), Double (64 bit)
    val myFloat: Float = 15.23F
    val myDouble: Double = 3.14159265358979323846

    // Booleans are used to represent logical values.
    // It can have two possible values true and false.
    var isSunny: Boolean = true
    isSunny = false

    // Characters
    val letterChar = 'A'
    val digitChar = '1'

    // Strings
    val myStr = "Augustine"
    var firstCharInStr = myStr[0]
    println("First character: $firstCharInStr")
    var lastCharInStr = myStr[myStr.length - 1]
    println("Last character: $lastCharInStr")

    // Arithmetic operators (+, -, *, /, %)
    var result = 5 + 4
    result /= 3
    result *= 4
    result -= 2
    result = 14%3
    println(result)

    val a = 3.0
    val b = 5
    var resultDouble: Double
    resultDouble = (a*b)
    println(resultDouble)


}