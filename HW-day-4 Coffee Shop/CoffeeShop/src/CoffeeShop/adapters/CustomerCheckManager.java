package CoffeeShop.adapters;

import CoffeeShop.entities.concretes.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}

}
