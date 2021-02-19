package com.example.numberdivider.shared.mortgage_calculator

import android.util.Log

actual class MortgageLogger actual constructor(val tag: String) {

    actual fun printLog(result: String) {
        Log.d(tag, result)
    }
}