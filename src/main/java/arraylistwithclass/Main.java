package arraylistwithclass;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer(1,"Engin", "Demirog"));
        customers.add(new Customer(2,"Derin", "Demirog"));
        customers.add(new Customer(3,"Salih", "Demirog"));

        customers.remove((new Customer(1,"Engin", "Demirog")));//silinmez eklenir

        for (Customer customer: customers){
            System.out.println(customer.firstName);
        }



    }


}
