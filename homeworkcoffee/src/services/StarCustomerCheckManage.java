package services;

import entities.*;
import interfaces.*;
import abstracts.*;

public class StarCustomerCheckManage extends CustomerCheckManager {
private PersonService realPersonService;
	
	public StarCustomerCheckManage(PersonService realPersonService){
		this.realPersonService = realPersonService;
	}

	@Override
	public Result CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return realPersonService.CheckIfRealPerson(customer);
	}

	@Override
	public Result CheckIfYoungerAgeThan(Customer customer, int age) {
		// TODO Auto-generated method stub
		return null;
	}
	


	

	

}
