package kunsan.yongho.report;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RunProductManagement {
	Scanner scan = new Scanner(System.in);

	public void printMenu() {
		System.out.println("1. 제품 데이터 입력\t2. 제품리스트 보기(날짜순 보기)\t3. 개별 제품가격 금액 조정");
		System.out.println("4. 모든 제품 가격 일괄 조정\t5. 가격 범위로 검색(가격순)\t6. 입고날짜로 검색\t7. 제품 삭제");
		System.out.print("8. 종료\t선택 : ");
	}

	public void runMenu() {
		while (true) {
			printMenu();
			try {
				int selection = scan.nextInt();

				switch (selection) {
				case 1:
					
					continue;
				case 2:
					
					continue;
				case 3:
					
					continue;
				case 4:
					
					continue;
				case 5:
					
					continue;
					
				case 6:
					continue;
				case 7:
					continue;
				case 8:
					System.out.println("프로그램을 종료합니다.");
					break;
				default:
					System.out.println("1~7사이의 숫자를 입력해주세요.(8은 종료)");
					continue;
				}
				break;
			} catch (InputMismatchException e) {
				System.out.println(e);
				scan.next();
				continue;
			}
		}
	}

	public static void main(String[] args) {
		RunProductManagement rpm = new RunProductManagement();
		rpm.runMenu();
	}

}