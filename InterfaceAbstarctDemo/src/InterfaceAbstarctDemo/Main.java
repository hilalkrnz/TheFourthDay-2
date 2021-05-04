package InterfaceAbstarctDemo;

import java.time.LocalDate;


import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new  StarbucksCustomerManager(new CustomerCheckManager(new KPSPublicSoapProxy()));
		customerManager.save(new Customer(1, "Hilal", "Kurnaz", LocalDate.of(2001,07,14), 23456812));
		
	}


	

}
