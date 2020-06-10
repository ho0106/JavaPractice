package kunsan.yongho.javatest;

import java.util.Scanner;

public class CoffeePrice {
	
	Scanner scan = new Scanner(System.in);
	
	public void calcPrice() {

		System.out.print("커피 메뉴 선택\n* 에스프레소 *\n* 카푸치노 *\n* 카페라떼 *\n* 아메리카노 *\n선택 : ");
		String order = scan.next();
		int price = 0;
		
		switch(order) {
		case "에스프레소" : price = 3500; break;
		case "카푸치노" : price = 4000; break;
		case "카페라떼" : price = 3800; break;
		case "아메리카노" : price = 2000; break;
		default : System.out.println("메뉴에 없습니다.");
		}
		if (price != 0)
			System.out.print(order + "는 " + price + "원 입니다.");
	}
}
