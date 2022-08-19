package day5_arithmetic_operators;

public class SalaryCalculator {
    public static void main(String[] args) {
       /* salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax

        Sample data:
        100000 (salary)
                0.08 (state tax rate)
        0.21 (federal tax rate)

        Hint: use tax rates of 0.08 and 0.21 for 8% and 21%

                Print the tax rates, your total salary, the amount of tax for state and federal, the total tax amount,
                 and your salary after all taxes

        */

        int salary = 100_000; //---> better to use double with money.
        double stateTaxRate = 0.08;
        double federalTaxRate = 0.21;
        double amountOfTaxState = salary * stateTaxRate;
        double amountOfFederalTax = salary * federalTaxRate;
        double totalTaxAmount = amountOfFederalTax + amountOfTaxState;
        double salaryAfterAllTaxes = salary - totalTaxAmount;


        System.out.println("salary = " + salary);
        System.out.println("stateTaxRate = " + stateTaxRate);
        System.out.println("federalTaxRate = " + federalTaxRate);
        System.out.println("amountOfTaxState = " + amountOfTaxState);
        System.out.println("amountOfFederalTax = " + amountOfFederalTax);
        System.out.println("salaryAfterAllTaxes = " + salaryAfterAllTaxes);















    }
}
