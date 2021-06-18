package gamesatis.adapters;

import java.rmi.RemoteException;
import java.util.Locale;

import gamesatis.entities.concretes.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PlayerCheckService {

	@Override
	public boolean checkIfRealPerson(Player player) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		var result = true;
		
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(player.getTcno().toUpperCase(new Locale("tr"))),player.getFirstName(),
					player.getLastName().toUpperCase(new Locale("tr")), player.getBdate());
		} catch (NumberFormatException | RemoteException e) {
			e.printStackTrace();
		}
		
		return result;
	}
		
}
