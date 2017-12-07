package kr.or.dgit.refactoring_study.price;

public class PriceFactroy {
	
	public static Price getFactory(MovieKind aPriceCode) {
		Price price = null;
		switch(aPriceCode) {
		case REGULAR : 
			price = RegularPrice.getInstance();
			break;
		case NEW_RELEASE : 
			price = NewReleasePrice.getInstance();
			break;
		case CHILDRENS : 
			price = ChildrenPrice.getInstance();
			break;
		case ACTION : 
			price = ActionPrice.getInstance();
			break;
		default : 
			throw new IllegalArgumentException("가격 코드가 잘못 됐습니다.");
		}
		return price;
	}

}
