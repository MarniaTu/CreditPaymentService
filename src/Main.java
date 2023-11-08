public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println();
        int creditForOneYear = service.calculate(1_000_000, 12);
        System.out.println("Ежемесячный платеж составит: " + creditForOneYear + " рубль(ля/лей)");

        System.out.println();
        int creditForTwoYears = service.calculate(1_000_000, 24);
        System.out.println("Ежемесячный платеж составит: " + creditForTwoYears + " рубль(ля/лей)");

        System.out.println();
        int creditForThreeYears = service.calculate(1_000_000, 36);
        System.out.println("Ежемесячный платеж составит: " + creditForThreeYears + " рубль(ля/лей)");
    }
}
