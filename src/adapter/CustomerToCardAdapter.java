package adapter;

import factory.Card;
import factory.CardFactory;
import factory.EliteCard;

public class CustomerToCardAdapter {

    private Customer customer;
    private double flightHours;
    public CustomerToCardAdapter(Customer customer,double flightHours){
        this.customer = customer;
        this.flightHours = flightHours;
    }

    public Card getCard(){
        if(this.customer.getCompany().equals("Turkish Airlines")){
            return CardFactory.getInstance("0",flightHours);
        }else if(this.customer.getCompany().equals("Lüks Artvin")){
            return CardFactory.getInstance("1",flightHours);
        }
        return CardFactory.getInstance("2",flightHours);
    }
}
