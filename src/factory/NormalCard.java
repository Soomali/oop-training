package factory;

public class NormalCard extends Card {
    NormalCard(double totalFlightHour) {
        super(totalFlightHour);
    }
    @Override
    public String getCompany() {
        return "Batman Turizm";
    }
}
