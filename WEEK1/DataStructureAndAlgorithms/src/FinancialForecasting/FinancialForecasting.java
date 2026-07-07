package FinancialForecasting;

public class FinancialForecasting {

    public static void main(String[] args) {
        double[] revenue = {12000, 15000, 18000, 21000};
        double growthRate = 0.10;

        double forecast = revenue[revenue.length - 1];

        forecast = forecast + (forecast * growthRate);

        System.out.println("Next Year Forecasted Revenue: " + forecast);
    }
}
