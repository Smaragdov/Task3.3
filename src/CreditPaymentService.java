public class CreditPaymentService {
    /**
     * метод рассчитывает ежемесячный платеж по кредиту
     *
     * @param amount     - общая сумма кредита
     * @param annualRate - процентная годовая ставка
     * @param n          - кол-во платежей в месяц
     * @return - ежемесячный платеж по кредиту
     */
    double calculate(double amount, double annualRate, int n) {

        // коэффициент аннуитета
        double m = annualRate / 12 / 100;

        double annuityRatio = (m * Math.pow((1 + m), n)) / (Math.pow((1 + m), n) - 1);

        return (int) (amount * annuityRatio);
    }
}
