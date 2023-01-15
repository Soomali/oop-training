package adapter;

public class Customer {
    private String company;
    public String name;

    public String getCompany() {
        return company;
    }

    public Customer(String company, String name){
        this.company = company;
        this.name = name;
    }
}
