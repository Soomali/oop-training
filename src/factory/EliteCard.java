package factory;

public class EliteCard extends Card{


    EliteCard(double totalFlightHour) {
        super(totalFlightHour);
    }

    @Override
    public String getCompany() {
        return "Turkish Airlines";
    }
}
