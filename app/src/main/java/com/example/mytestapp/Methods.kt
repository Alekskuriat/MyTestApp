package com.example.mytestapp

class Methods {

    fun sum(a: Int, b: Int) = a + b

    fun divisionByZero(a: Int, b: Int) : Boolean{
        return a == 0 || b == 0
    }

    fun sameOrNull(a: Int, b: Int) : Int? {
        return if (a == b) b else null
    }


}