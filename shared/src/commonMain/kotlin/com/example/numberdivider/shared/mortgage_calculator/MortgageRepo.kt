package com.example.numberdivider.shared.mortgage_calculator


class MortgageRepo(
    private val logger: MortgageLogger? = null
) {

    fun calcPayment(
        principal: Int,
        interestRate: Float,
    ): String {
        // Assuming a 30 year term.
        val termInMonths = 30 * 12

        val monthlyInterestRate = interestRate / 12f / 100f
        var onePlusMonthlyRate = monthlyInterestRate + 1
        for(i in 0 until termInMonths) {
            onePlusMonthlyRate *= (monthlyInterestRate + 1)
        }

        val monthlyPayment = (
                principal *
                (monthlyInterestRate * onePlusMonthlyRate) /
                (onePlusMonthlyRate - 1)
            ).toString()

        logger?.printLog(monthlyPayment)

        return monthlyPayment
    }
}