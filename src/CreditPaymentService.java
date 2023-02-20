public class CreditPaymentService {
    public double calculate(int loanAmount, int loanPeriod, double annualInterestRate) {
        double monthlyInterestRate = annualInterestRate / 12 / 100;
        return loanAmount * ((monthlyInterestRate * Math.pow(1 + monthlyInterestRate, loanPeriod))
                / (Math.pow(1 + monthlyInterestRate, loanPeriod) - 1));
    }
}
