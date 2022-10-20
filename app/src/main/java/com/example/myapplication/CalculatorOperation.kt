package com.example.myapplication

sealed class CalculatorOperation(var symbol:String){
    object Add:CalculatorOperation("+")
    object Substract : CalculatorOperation("-")
    object Multiply : CalculatorOperation("x")
    object Divide :CalculatorOperation("/")
}
