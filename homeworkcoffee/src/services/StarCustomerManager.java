package services;

import entities.Customer;
import interfaces.CustomerCheckService;
import interfaces.*;

public class StarCustomerManager  extends CustomerManager{
private CustomerCheckService customerCheckService;
	
	
	public StarCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}


	@Override
	public void add(Customer customer) {

		Result result =  CheckServiceUtils.runCheckServices(new Result[] {
				customerCheckService.CheckRealPerson(customer), 
				customerCheckService.CheckIfYoungerAgeThan(customer, 15)
				});
		
		if(!result.isSuccess()) {
			System.out.println(result.getMessage());
			return;
		}
		
		super.add(customer);
	}
}
