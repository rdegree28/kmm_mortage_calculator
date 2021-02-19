package com.example.numberdivider.androidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.numberdivider.shared.Greeting
import android.widget.TextView
import com.example.numberdivider.shared.mortgage_calculator.MortgageLogger
import com.example.numberdivider.shared.mortgage_calculator.MortgageRepo


class MainActivity : AppCompatActivity() {

    private val repo = MortgageRepo(MortgageLogger("Result Android"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "Mortgage Calculator"

        findViewById<Button>(R.id.calculate_button).setOnClickListener {
            calculate()
        }
    }

    private fun calculate() {

        val principal = findViewById<EditText>(R.id.principal_edit_text).text.toString().toInt()
        val interestRate =  findViewById<EditText>(R.id.interest_edit_text).text.toString().toFloat()

        val result = repo.calcPayment(principal = principal, interestRate = interestRate)

        findViewById<TextView>(R.id.result_text_view).text = result
    }
}
