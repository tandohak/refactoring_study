package kr.or.dgit.refactoring_study.price;

public abstract class Price {
 	public abstract MovieKind getPriceCode();
 	public abstract double getCharge(int aDaysRented);
 	public int getFrequentRenterPoints(int aDaysRented) {
 		return 1;
 	}
}
