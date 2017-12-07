package kr.or.dgit.refactoring_study;

import kr.or.dgit.refactoring_study.price.MovieKind;
import kr.or.dgit.refactoring_study.statement.OutKind;
import kr.or.dgit.refactoring_study.statement.Statement;

public class TestMain {
	public static void main(String[] args) {
		
		//Movie 액션물을 추가 대여기간 2일까지 4딸라! 이후 초과일수에 $2 추가
		//대여현황을 xml로 출력되는 기능을 추가하시오.
		
		Movie mc1 = new Movie("니모를 찾아서", MovieKind.CHILDRENS);
		Movie mc2 = new Movie("말레피센트", MovieKind.CHILDRENS);
		Movie mr1 = new Movie("명량", MovieKind.REGULAR);
		Movie mr2 = new Movie("변호사", MovieKind.REGULAR);
		Movie mn1 = new Movie("곡성", MovieKind.NEW_RELEASE);
		Movie mn2 = new Movie("인디펜던스데이", MovieKind.NEW_RELEASE);
		Movie ma1 = new Movie("킹스맨2", MovieKind.ACTION);
		
		Rental r1 = new Rental(mc1, 3);
		Rental r2 = new Rental(mc2, 4);
		Rental r3 = new Rental(mr1, 2);
		Rental r4 = new Rental(mr2, 3);
		Rental r5 = new Rental(mn1, 2);
		Rental r6 = new Rental(mn2, 3);
		Rental r7 = new Rental(ma1, 2);
		
		Customer c = new Customer("김주하");
		c.addRentals(r1);
		c.addRentals(r3);
		c.addRentals(r5);
		c.addRentals(r7);
		
		Customer c1 = new Customer("김희영");
		c1.addRentals(r2);
		c1.addRentals(r4);
		c1.addRentals(r6);
		c1.addRentals(r7);
		
		System.out.println(c.statement(OutKind.TEXT));
		System.out.println();
		System.out.println(c1.statement(OutKind.TEXT));
		
		System.out.println("=====================html=======================");
		System.out.println(c.statement(OutKind.HTML));
		System.out.println();
		System.out.println(c1.statement(OutKind.HTML));
		
		System.out.println("=====================XML=======================");
		System.out.println(c.statement(OutKind.XML));
		System.out.println();
		System.out.println(c1.statement(OutKind.XML));
		
	}
}
