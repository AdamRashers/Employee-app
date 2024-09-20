


fun main () {
    val firstName: String = "Joe"
    val lastName: String = "Soap"
    val gender: String = "Male"
    val employeeID: Int = 6143
    val employeeSalary: Int = 6754321
    val employeePAYE: Double = 38.5
    val employeePRSI: Double = 5.2
    val annualBonus: Int = 145050
    val cycleDiscount: Double = 54.33
    val monthlySalary: Int = employeeSalary / 12;
    val payTAX: Double = monthlySalary * employeePAYE
    val monthlyBonus: Double = annualBonus / 12.0
    val payPRSI: Double = monthlySalary * employeePRSI
    val grossPay: Double = monthlySalary + monthlyBonus
    val deductionsTotal: Double = payTAX + payPRSI - cycleDiscount
    val netWorth: Double = grossPay - deductionsTotal

    println("⏐-----------------------------------------------------------------⏐")
    println("⏐                                                                 ⏐")
    println("⏐----------------------Monthly Payslip----------------------------⏐")
    println("⏐                                                                 ⏐")
    println("⏐-----------------------------------------------------------------")
    println("⏐                                                                 ⏐")
    println("⏐Employee Name: $firstName $lastName      Employee ID: $employeeID⏐")
    println("⏐                                                                 ⏐")
    println("⏐-----------------------------------------------------------------⏐")
    println("⏐                                                                 ⏐")
    println("⏐       PAYMENT DETAILS                      DEDUCTION DETAILS    ⏐")
    println("⏐                                                                 ⏐")
    println("⏐-----------------------------------------------------------------⏐")
    println("⏐Salary: $monthlySalary                             PAYE:  $payTAX⏐")
    println("⏐Bonus: $monthlyBonus                              PRSI:  $payPRSI⏐")
    println("⏐                                                                 ⏐")
    println("⏐                                                                 ⏐")
    println("⏐-----------------------------------------------------------------⏐")
    println("⏐Gross: $grossPay                  Total Deductions:  $deductionsTotal⏐")
    println("⏐                                                                 ⏐")
    println("⏐-----------------------------------------------------------------⏐")
    println("⏐                   Net Worth: $netWorth                     ⏐")
    println("⏐                                                                 ⏐")
    println("⏐-----------------------------------------------------------------⏐")




}
