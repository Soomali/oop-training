package strategy;
interface CardStrategy {
    double calculatePrice(double flightHours);
    double calculateMile(double flightHours);
}

public class CustomerContext {
    private CardStrategy strategy;

    public void setStrategy(CardStrategy strategy) {
        this.strategy = strategy;
    }
    public double calculatePrice(double flightHours) {
        return strategy.calculatePrice(flightHours);
    }
    public double calculateMile(double flightHours){
        return strategy.calculateMile(flightHours);
    }
}
