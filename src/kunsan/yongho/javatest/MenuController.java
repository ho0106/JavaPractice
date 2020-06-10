package kunsan.yongho.javatest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuController {
	
	Scanner scan = new Scanner(System.in);
	
	public void printMenu() { //메뉴 기능
		MenuController mc = new MenuController();
		while (true) {
			
			mc.printList();
			int num;
			
			try {
				num = scan.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("잘못 입력하셨습니다.\n1~7사이의 숫자를 입력하세요.(0은 종료)\n" + e);
				scan.next();
				continue;
			}
			
			switch (num) {
				case 1: mc.menu1(); continue;
				
				case 2: mc.menu2(); continue;
				
				case 3: mc.menu3(); continue;
				
				case 4: mc.menu4(); continue;
				
				case 5: mc.menu5(); continue;
				
				case 6: mc.menu6(); continue;
				
				case 7: mc.menu7(); continue;
				
				case 8: mc.menu8(); continue;
				
				case 0: System.out.println("프로그램을 종료합니다."); break;
				
				default : System.out.println("잘못 입력하셨습니다.\n1~7사이의 숫자를 입력하세요.(0은 종료)\n"); continue;

			}
			break;
		}
	}
	
	public void menu1() { //커피메뉴 가격출력
		CoffeePrice cp = new CoffeePrice();
		cp.calcPrice();
		System.out.println("\n");
	}
	
	public void menu2() { //입력된 수의 평균 갯수 프린트
		NumberAverage na = new NumberAverage();
		na.getAverage();
		System.out.println("\n");
	}
	
	public void menu3() { //알파벳 A TO Z
		ViewAZ az = new ViewAZ();
		az.printAToZ();
		System.out.println("\n");
	}
	
	public void menu4() { //정수 x,y 입력받아 더하는과정과 결과
		ForSum fs = new ForSum();
		fs.printSum();
		System.out.println("\n");
	}
	
	public void menu5() { //단순 구구단
		Simple99 s9 = new Simple99();
		s9.print99();
		System.out.println("\n");
	}
	
	public void menu6() { //범위설정 구구단
		Range99 r9 = new Range99();
		r9.printRange99();
		System.out.println("\n");
	}
	
	public void menu7() { //은행 입출금조회
		Bank bp = new Bank();
		bp.bankMenu();
		System.out.println("\n");
	}
	
	public void menu8() { //학생 성적처리 프로그램
		StudentScore ss = new StudentScore();
		ss.studentMenu();
		System.out.println("\n");
	}
	
	public void printList() { //메뉴 리스트 프린트
		System.out.println("\t**다음의 프로그램들 중에서 수행할 함수를 선택하세요.**\n");
		System.out.println("\t1) 커피 메뉴를 넣으면 가격을 출력해 주는 프로그램.");
		System.out.println("\t2) 입력된 수의 평균과 갯수 구하기 해서 화면에 프린트하기.");
		System.out.println("\t3) 알파벳 A부터Z까지 프린트 하기.");
		System.out.println("\t4) 정수 x와 y를 입력받아, x부터 y까지 더하는 과정과 결과 보이기.");
		System.out.println("\t5) 구구단 단순 찍기.");
		System.out.println("\t6) 구구단 출력단수와 수의 범위 설정해서 프린트하기.");
		System.out.println("\t7) 은행 프로그램.");
		System.out.println("\t8) 학생성적 처리 프로그램(1차원 배열).");
		System.out.println("\t0) 종료");
		System.out.print("선택 : ");
	}
		
	public static void main (String[] args) { //메인
		
		MenuController mc = new MenuController();
		mc.printMenu();
	}
}