package CoffeeShop.adapters;

import java.rmi.RemoteException;
import java.util.Locale;

import CoffeeShop.entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		var result= true;
	
			try {
				result = client.TCKimlikNoDogrula(Long.parseLong(customer.getTcNo()), customer.getFirstName().toUpperCase(new Locale("tr")),
						customer.getLastName().toUpperCase(new Locale("tr")),
						customer.getTimeOfBirth());
			} catch (NumberFormatException | RemoteException e) {
				e.printStackTrace();
			}
		return result;
	}

}
