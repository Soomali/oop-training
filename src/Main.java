import adapter.Customer;
import adapter.CustomerToCardAdapter;
import factory.Card;
import factory.CardFactory;
import factory.ClassicalCard;
import factory.EliteCard;
import strategy.ClassicCustomerStrategy;
import strategy.CustomerContext;
import strategy.EliteCustomerStrategy;
import strategy.NormalCustomerStrategy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Card> cards = new ArrayList<>();
        Customer customer1 = new Customer("Turkish Airlines","Mahmut");
        Customer customer2 = new Customer("Lüks Artvin","Mali");
        Customer customer3 = new Customer("Batman","Onur");
        CustomerToCardAdapter adapter1 = new CustomerToCardAdapter(customer1,100);
        CustomerToCardAdapter adapter2 = new CustomerToCardAdapter(customer2,150);
        CustomerToCardAdapter adapter3 = new CustomerToCardAdapter(customer3,300);

        cards.add(adapter1.getCard());
        cards.add(adapter2.getCard());
        cards.add(adapter3.getCard());
        cards.add(CardFactory.getInstance("0",150));
        cards.add(CardFactory.getInstance("1",150));
        cards.add(CardFactory.getInstance("2",150));
        cards.add(CardFactory.getInstance("1",250));

        CustomerContext customerContext = new CustomerContext();

        for(Card card:cards){
            if(card instanceof EliteCard){
                customerContext.setStrategy(new EliteCustomerStrategy());
            }else if(card instanceof ClassicalCard) {
                customerContext.setStrategy(new ClassicCustomerStrategy());
            }else {
                customerContext.setStrategy(new NormalCustomerStrategy());
            }
            System.out.println("price for card:" + customerContext.calculatePrice(card.getTotalFlightHour())
                    + " miles for card:" + customerContext.calculateMile(card.getTotalFlightHour())
            );

        }
    }
}