package com.example.myapplication

sealed class CalculatorAction{
    data class Number(val num:Int):CalculatorAction()
    object Clear:CalculatorAction()
    object Calculate:CalculatorAction()
    object Delete : CalculatorAction()
    object  Decimal : CalculatorAction()
    data class Operation(val operation: CalculatorOperation):CalculatorAction()
}
