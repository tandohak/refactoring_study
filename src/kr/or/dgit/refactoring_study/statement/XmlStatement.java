package kr.or.dgit.refactoring_study.statement;

import kr.or.dgit.refactoring_study.Customer;
import kr.or.dgit.refactoring_study.Rental;

public class XmlStatement extends Statement {
	private static final XmlStatement instance = new XmlStatement();
	
	public static XmlStatement getInstance() {
		return instance;
	}

	private XmlStatement() {}
	
	@Override
	protected String headerString(String customerName) {
		return String.format("<customer>%n<고객명>고객님의 대여기록</고객명>%n", customerName);				
	}

	@Override
	protected String eachRentalString(Rental aEach) {
		return String.format("\t<movie title='%s'>%s</movie>%n", aEach.getMovie().getTitle(),aEach.getCharge());
	}

	@Override
	protected String footerString(Customer aCustomer) {
		return String.format("<누적대여료>%s</누적>%n<적립포인트>%s</적립포인트>%n</customer>", aCustomer.getTotalCharge(), aCustomer.getTotalFrequentRenterPoints());
	}

}
