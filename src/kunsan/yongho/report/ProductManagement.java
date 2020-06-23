package kunsan.yongho.report;

import java.util.Scanner;

public class ProductManagement {
	Scanner scan = new Scanner(System.in);

	public void insertProduct() {
		while (true) {
			System.out.print("제품 종류는? (c: CPU, r: 냉장고, a: 오디오) : ");
			String choice = scan.next();
			
			switch(choice) {
			case "c" :
				continue;
			case "r" :
				continue;
			case "a" :
				continue;
				default : System.out.println("잘못 입력하셨습니다. 메뉴로 돌아갑니다.");
			}
		}
	}

}
