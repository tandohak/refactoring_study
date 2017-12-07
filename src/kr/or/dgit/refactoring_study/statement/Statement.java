package kr.or.dgit.refactoring_study.statement;

import java.util.List;

import kr.or.dgit.refactoring_study.Customer;
import kr.or.dgit.refactoring_study.Rental;

public abstract class Statement{
	public static final int HTML = 0;
	public static final int TEXT = 1;
	
	public String value(Customer customer) {
		List<Rental> rentals = customer.getRentals();
		
		StringBuilder result = new StringBuilder(headerString(customer.getName()));
		
		for(Rental each : rentals) {
			result.append(eachRentalString(each));
		}
		
		result.append(footerString(customer));
		return result.toString();		
	}
	
	protected abstract String headerString(String customerName);
	
	protected abstract String eachRentalString(Rental aEach);
	
	protected abstract String footerString(Customer aCustomer);
}
