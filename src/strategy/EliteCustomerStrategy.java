package strategy;

public class EliteCustomerStrategy implements CardStrategy {
    @Override
    public double calculatePrice(double flightHours) {
        return flightHours * 50;
    }

    @Override
    public double calculateMile(double flightHours) {
        return flightHours * 1.5;
    }
}
