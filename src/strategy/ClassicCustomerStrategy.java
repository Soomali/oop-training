package strategy;

public class ClassicCustomerStrategy implements CardStrategy{
    @Override
    public double calculatePrice(double flightHours) {
        return flightHours * 100;
    }

    @Override
    public double calculateMile(double flightHours) {
        return flightHours;
    }
}
