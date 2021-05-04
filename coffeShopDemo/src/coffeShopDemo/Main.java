package coffeShopDemo;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter()); 
		Customer customer = new Customer(2,"Kübra","Sönmez",LocalDate.of(1999, 6, 17),"57561348258");
		baseCustomerManager.save(customer);
	}

}
