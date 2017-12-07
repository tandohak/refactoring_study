package kr.or.dgit.refactoring_study;

import kr.or.dgit.refactoring_study.price.MovieKind;
import kr.or.dgit.refactoring_study.price.Price;
import kr.or.dgit.refactoring_study.price.PriceFactroy;

public class Movie {
	private String title;
	private Price price;
	
	public Movie(String title, MovieKind priceCode) {
		this.title = title;
		setPriceCode(priceCode);
	}

	public String getTitle() {
		return title;
	}

	public MovieKind getPriceCode() {
		return price.getPriceCode();
	}

	public void setPriceCode(MovieKind priceCode) {
		price = PriceFactroy.getFactory(priceCode);		
	}	
	
	public double getCharge(int aDaysRented) {		
		return price.getCharge(aDaysRented);
	}
	
	public int getFrequentRenterPoints(int aDaysRented) {
		return price.getFrequentRenterPoints(aDaysRented);
	}
}
