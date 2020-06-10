package kunsan.yongho.javatest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {
	
	Scanner scan = new Scanner(System.in);
	int balance;
	
	public void printMenu() { //메뉴 출력
		for(int i=0; i<=31; i++,System.out.print("-"));
		System.out.println("\n1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
		for(int i=0; i<=31; i++,System.out.print("-"));
		System.out.print("\n선택> ");
	}
	
	public void deposit() { //입금
		while (true) {
			System.out.print("예금액> ");
			String in;
			try {
				in = scan.next();
				int money = Integer.parseInt(in);
				if(money > 0) {
					balance += money;
				} else {
					System.out.println("입금액을 다시 확인해 주세요.");
				}
			} catch (NumberFormatException e) {
				System.out.println("정수를 입력해 주세요.\n" + e);
				continue;
			}break;
			
		}getBalance();
	}
	

	public void withdraw() { //출금
		while (true) {
			System.out.print("출금액> ");
			String out;
			try {
				out = scan.next();
				int money = Integer.parseInt(out);
				if(money <= balance && money > 0) {
					balance -= money;
				} else {
					System.out.println("잔고가 부족합니다.(출금 거부)");
				}
			} catch (NumberFormatException e) {
				System.out.println("정수를 입력해 주세요.\n" + e);
				continue;
			}break;
		}getBalance();
	}
	
	public void getBalance() { //잔고조회
		System.out.print("잔고> " + balance +  "원\n");
	}
	
	public void bankMenu() { //은행프로그램
		
		Bank bp = new Bank();
		
		while(true) {
			
			bp.printMenu();
			int num = 0;
			
			try {
				num = scan.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못 입력하셨습니다.\n1~4사이의 숫자를 입력하세요.\n" + e);
				scan.next();
				continue;
			}
			
			switch(num) {
				case 1: bp.deposit(); continue;
				
				case 2: bp.withdraw(); continue;
				
				case 3: bp.getBalance(); continue;
				
				case 4: System.out.println("은행 프로그램 종료"); break;
				
				default : System.out.println("1~4사이의 숫자를 입력하세요."); continue;
			}
			break;
		}
	}
}