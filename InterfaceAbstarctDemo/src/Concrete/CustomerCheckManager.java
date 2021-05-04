package Concrete;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;

import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class CustomerCheckManager implements CustomerCheckService{
	
	private KPSPublicSoapProxy kpsPublicSoap;
	
	

	public CustomerCheckManager(KPSPublicSoapProxy kpsPublicSoap) {
		this.kpsPublicSoap = kpsPublicSoap;
	}



	@Override
	public boolean CheckIfRealCustomer(Customer customer) {
		
		boolean check = false;
		
		long nationalID = Long.valueOf(customer.getNationalID());
		int yearOfBirth = customer.getDateOfBirth().getYear();
		
		try {
			
			if (this.kpsPublicSoap.TCKimlikNoDogrula(nationalID, customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), yearOfBirth)) {
				
			}
			
		} catch (RemoteException e) {
			
			e.printStackTrace();
			check = false;
		}
		
		return check;
	}




}
