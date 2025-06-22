public class Forecaster {
    public double forecast(FinancialData data) {
        double p = data.getPrincipal();
        double r = data.getAnnualRate() / 100;
        int t = data.getYears();
        return p * Math.pow(1 + r, t);
    }
}
