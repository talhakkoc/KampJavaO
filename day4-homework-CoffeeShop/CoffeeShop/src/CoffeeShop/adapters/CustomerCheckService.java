package CoffeeShop.adapters;

import CoffeeShop.entities.concretes.Customer;

public interface CustomerCheckService {

	public boolean checkIfRealPerson(Customer customer);
}
