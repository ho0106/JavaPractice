package kunsan.yongho.inheritance;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainUniver {
	Scanner scan = new Scanner(System.in);

	public void printMenu() { // 메뉴 출력
		System.out.println("1. 대학 구성원 데이터 입력");
		System.out.println("2. 대학 구성원 데이터 전체 출력");
		System.out.println("3. 대학 구성원 데이터 조건 검색");
		System.out.println("4. 대학 구성원 데이터 변경");
		System.out.println("5. 대학 구성원 데이터 삭제");
		System.out.println("0. 종료");
		System.out.print("입력 : ");
	}

	public void runMenu() { // 메뉴 구동
		UniverManagement um = new UniverManagement();
		Person[] persons = null;
		while (true) {
			printMenu();
			try {
				int selection = scan.nextInt();

				switch (selection) {
				case 1:
					persons = um.inputInfomation(persons);
					continue;
				case 2:
					um.printAll(persons);
					continue;
				case 3:
					um.searchData(persons, 2020);
					continue;
				case 4:
					um.updateData(persons);
					continue;
				case 5:
					//um.removeData(persons);
					continue;
				case 0:
					System.out.println("프로그램을 종료합니다.");
					break;
				default:
					System.out.println("1~5사이의 숫자를 입력해주세요.(0은 종료)");
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

	public static void main(String[] args) { // 메인 함수
		MainUniver mu = new MainUniver();
		mu.runMenu();
	}

}
