package factory;

public class ClassicalCard extends Card {


    ClassicalCard(double totalFlightHour) {
        super(totalFlightHour);
    }

    @Override
    public String getCompany() {
        return "Lüks Artvin";
    }
}
