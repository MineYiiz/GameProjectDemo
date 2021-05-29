package Adapters;

import java.rmi.RemoteException;

import Abstract.GamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		KPSPublicSoapProxy kpsProxy = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			return kpsProxy.TCKimlikNoDogrula(
					Long.parseLong(gamer.getNationalityId()), 
					gamer.getFirstName().toUpperCase(),
					gamer.getLastName().toUpperCase(),
					gamer.getBirthDate().getYear());
		} catch (NumberFormatException e) {
			System.out.println("Not a valid person");
		} catch (RemoteException e) {
			System.out.println("Not a valid person"); 
		}
		return result;
	}

}
