package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean CheckIfRealCustomer(Customer customer) {
		
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		
		boolean result = false;
		
		try {
			
			return kpsPublic.TCKimlikNoDogrula(customer.getNationalID(), customer.getFirstName(), customer.getLastName(),
					customer.getDateOfBirth().getYear());
			
		} catch (RemoteException e) {
			
		}
		return result;
		
		
	}

}
