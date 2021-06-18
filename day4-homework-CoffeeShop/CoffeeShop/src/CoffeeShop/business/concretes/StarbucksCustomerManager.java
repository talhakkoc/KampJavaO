package CoffeeShop.business.concretes;

import CoffeeShop.adapters.CustomerCheckService;
import CoffeeShop.business.abstracts.BaseCustomerManager;
import CoffeeShop.business.abstracts.CustomerService;
import CoffeeShop.entities.concretes.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService=customerCheckService;
	}
	
	@Override
	public  void save(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("not a valid person");
		}
		
	}
	
}
