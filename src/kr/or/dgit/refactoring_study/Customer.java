package kr.or.dgit.refactoring_study;

import java.lang.Thread.State;
import java.util.ArrayList;
import java.util.List;

import kr.or.dgit.refactoring_study.statement.HtmlStatement;
import kr.or.dgit.refactoring_study.statement.OutKind;
import kr.or.dgit.refactoring_study.statement.Statement;
import kr.or.dgit.refactoring_study.statement.StatementFactory;
import kr.or.dgit.refactoring_study.statement.TextStatement;

public class Customer {
	private String name;
	private List<Rental> rentals = new ArrayList<>();
	
	public Customer(String name) {
		this.name = name;
	}
	
	public void addRentals(Rental aRentals) {
		this.rentals.add(aRentals);
	}

	public String getName() {
		return name;
	}
	
	public List<Rental> getRentals() {
		return rentals;
	}

	public String statement(OutKind isText) {
		return StatementFactory.getStatement(isText).value(this);
	}
	
	
	public int getTotalFrequentRenterPoints() {
		int result = 0;
		for(Rental rental : rentals) {
			result += rental.getFrequentRenterPoints();
		}
		return result;
	}

	public double getTotalCharge() {
		double result = 0;
		for(Rental rental : rentals) {
			result += rental.getCharge();
		}
		return result;
	}

	
}
