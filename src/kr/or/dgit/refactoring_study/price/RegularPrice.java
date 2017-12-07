package kr.or.dgit.refactoring_study.price;

public class RegularPrice extends Price {
	private static final RegularPrice instance = new RegularPrice();
	
	public static RegularPrice getInstance() {
		return instance;
	}

	private RegularPrice() {}	

	@Override
	public MovieKind getPriceCode() {
		return MovieKind.REGULAR;
	}

	@Override
	public double getCharge(int aDaysRented) {
		double result = 0;
		result += 2;
		if(aDaysRented>2)
			result += (aDaysRented - 2) * 1.5;
		return result;
	}

}
