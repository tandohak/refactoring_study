package kr.or.dgit.refactoring_study.price;

public class ActionPrice extends Price {
	private static final ActionPrice instance = new ActionPrice();
	
	public static ActionPrice getInstance() {
		return instance;
	}

	private ActionPrice() {}	
	
	@Override
	public MovieKind getPriceCode() {
		return MovieKind.ACTION;
	}

	@Override
	public double getCharge(int aDaysRented) {
		double result = 0;
		result += 4;
		if(aDaysRented>2)
			result += (aDaysRented - 2) * 2;
		return result;
	}

}
