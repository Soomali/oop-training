package factory;

public class CardFactory {

    public static Card getInstance(String type,double flightHours){
        if(type.equals("0")){
            return new EliteCard(flightHours);
        }else if(type.equals("1")){
            return new ClassicalCard(flightHours);
        }
        return new NormalCard(flightHours);
    }
}
