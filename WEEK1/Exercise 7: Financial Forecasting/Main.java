public class Main {
    public static void main(String[] args) {
        FinancialData data = new FinancialData(10000, 7.5, 5);
        Forecaster forecaster = new Forecaster();
        double futureValue = forecaster.forecast(data);
        System.out.printf("Forecasted value after %d years: %.2f%n", data.getYears(), futureValue);
    }
}
