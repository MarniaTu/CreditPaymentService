public class CreditPaymentService {
    public int calculate(int sum, int periods) {
        double percentMonthly = 9.99 / 100 / 12;
        double ratio;
        double c = Math.pow(1 + percentMonthly, periods);
        ratio = percentMonthly * c / (c - 1);
        double amount = sum * ratio;
        return (int) amount;
    }
}
