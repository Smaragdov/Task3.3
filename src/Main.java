public class Main {
    public static void main(String[] args) {
        CreditPaymentService credit = new CreditPaymentService();

        System.out.println(credit.calculate(1000000, 9.99, 12));
        System.out.println(credit.calculate(1000000, 9.99, 24));
        System.out.println(credit.calculate(1000000, 9.99, 36));

    }
}
