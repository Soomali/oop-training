package strategy;

public class NormalCustomerStrategy implements CardStrategy {
    @Override
    public double calculatePrice(double flightHours) {
        return flightHours * 180;
    }

    @Override
    public double calculateMile(double flightHours) {
        return flightHours * 0.5;
    }
}
