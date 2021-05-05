package abstracts;

import interfaces.CustomerCheckService;

public abstract class CustomerCheckManager implements CustomerCheckService  {
	@Override
	public Result CheckIfRealPerson(Customer customer) {
		
		return new homework2.utils.Result(true);
	}

	@Override
	public final Result CheckIfYoungerAgeThan(Customer customer, int age) {
		LocalDate todayDateTime = LocalDate.now();
		LocalDate birthDate = customer.getBirthDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		int yearDifference = Period.between(birthDate, todayDateTime).getYears();
		if(yearDifference < age) {
			return new utils.Result(false, age + " yaþýndan küçük olamaz.");
		}
		return new homework2.utils.Result(true);
	}

}
