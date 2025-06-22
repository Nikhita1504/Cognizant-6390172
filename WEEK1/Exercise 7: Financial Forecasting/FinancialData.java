public class FinancialData {
    private double principal;
    private double annualRate;
    private int years;

    public FinancialData(double principal, double annualRate, int years) {
        this.principal = principal;
        this.annualRate = annualRate;
        this.years = years;
    }

    public double getPrincipal() {
        return principal;
    }

    public double getAnnualRate() {
        return annualRate;
    }

    public int getYears() {
        return years;
    }
}
