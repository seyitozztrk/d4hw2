import java.util.GregorianCalendar;

import entities.Customer;
import interfaces.*;
import services.*;
import adapters.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer enginCustomer = new Customer();
		enginCustomer.setId(1);
		enginCustomer.setNationalityid("000000000000");
		enginCustomer.setFirstname("Ada");
		enginCustomer.setLastname("Öz");
		enginCustomer.setDateofbirth(new GregorianCalendar(1993, 11 , 16).getTime());
		
		CustomerCheckService customerCheckService =  new StarCustomerCheckManage(new MernisAdapter());
		
		CustomerService customerService = (CustomerService) new StarCustomerManager(customerCheckService);
		customerService.add(enginCustomer);
	}


}
