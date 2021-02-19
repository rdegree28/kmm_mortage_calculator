package com.example.numberdivider.shared.mortgage_calculator

actual class MortgageLogger actual constructor(val tag: String) {

    actual fun printLog(result: String) {
        print(tag + " - " + result)
    }
}