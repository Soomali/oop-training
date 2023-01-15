package factory;

public abstract class Card {
    private double totalFlightHour;
    Card(double totalFlightHour){
        this.totalFlightHour = totalFlightHour;
    }
    public double getTotalFlightHour() {
        return this.totalFlightHour;
    }
    abstract String getCompany();
}
