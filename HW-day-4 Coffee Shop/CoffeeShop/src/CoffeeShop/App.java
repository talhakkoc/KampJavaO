package CoffeeShop;

import java.util.Locale;

import CoffeeShop.adapters.CustomerCheckManager;
import CoffeeShop.adapters.CustomerCheckService;
import CoffeeShop.adapters.MernisServiceAdapter;
import CoffeeShop.business.abstracts.BaseCustomerManager;
import CoffeeShop.business.concretes.NeroCustomerManager;
import CoffeeShop.business.concretes.StarbucksCustomerManager;
import CoffeeShop.entities.concretes.Customer;

public class App {

	public static void main(String[] args) {
	
			
	//	BaseCustomerManager customerManager = new StarbucksCustomerManager(new CustomerCheckManager());

		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());

		customerManager.save(new Customer(1, "Talha", "Akkoç",1996, "10139028318"));

 }
}