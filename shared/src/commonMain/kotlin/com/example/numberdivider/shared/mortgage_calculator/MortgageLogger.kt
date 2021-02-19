package com.example.numberdivider.shared.mortgage_calculator

expect class MortgageLogger(
    tag: String
) {

    fun printLog(result: String)
}