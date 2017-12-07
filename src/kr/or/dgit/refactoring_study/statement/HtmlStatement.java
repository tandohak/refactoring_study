package kr.or.dgit.refactoring_study.statement;

import java.util.List;

import kr.or.dgit.refactoring_study.Customer;
import kr.or.dgit.refactoring_study.Rental;

public class HtmlStatement extends Statement {
	private static final HtmlStatement instance = new HtmlStatement();
	
	public static HtmlStatement getInstance() {
		return instance;
	}

	private HtmlStatement() {}
	
	@Override
	protected String headerString(String customerName) {
		return String.format("<h1><em>%s 고객님의 대여기록&n</em></h1><p>%n", customerName);		
	}
	
	@Override
	protected String eachRentalString(Rental aEach) {
		return String.format("%s : %s<br>%n", aEach.getMovie().getTitle(),aEach.getCharge());
	}
	
	@Override
	protected String footerString(Customer aCustomer) {
		return String.format("<p>누적 대여료: <em>%s</em> %n<p>적립 포인트 :<em>%s</em><p>", aCustomer.getTotalCharge(), aCustomer.getTotalFrequentRenterPoints());
	}

}
