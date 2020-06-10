package kunsan.yongho.javatest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {
	
	Scanner scan = new Scanner(System.in);
	int balance;
	
	public void printMenu() { //�޴� ���
		for(int i=0; i<=31; i++,System.out.print("-"));
		System.out.println("\n1. ���� | 2. ��� | 3. �ܰ� | 4. ����");
		for(int i=0; i<=31; i++,System.out.print("-"));
		System.out.print("\n����> ");
	}
	
	public void deposit() { //�Ա�
		while (true) {
			System.out.print("���ݾ�> ");
			String in;
			try {
				in = scan.next();
				int money = Integer.parseInt(in);
				if(money > 0) {
					balance += money;
				} else {
					System.out.println("�Աݾ��� �ٽ� Ȯ���� �ּ���.");
				}
			} catch (NumberFormatException e) {
				System.out.println("������ �Է��� �ּ���.\n" + e);
				continue;
			}break;
			
		}getBalance();
	}
	

	public void withdraw() { //���
		while (true) {
			System.out.print("��ݾ�> ");
			String out;
			try {
				out = scan.next();
				int money = Integer.parseInt(out);
				if(money <= balance && money > 0) {
					balance -= money;
				} else {
					System.out.println("�ܰ� �����մϴ�.(��� �ź�)");
				}
			} catch (NumberFormatException e) {
				System.out.println("������ �Է��� �ּ���.\n" + e);
				continue;
			}break;
		}getBalance();
	}
	
	public void getBalance() { //�ܰ���ȸ
		System.out.print("�ܰ�> " + balance +  "��\n");
	}
	
	public void bankMenu() { //�������α׷�
		
		Bank bp = new Bank();
		
		while(true) {
			
			bp.printMenu();
			int num = 0;
			
			try {
				num = scan.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.\n1~4������ ���ڸ� �Է��ϼ���.\n" + e);
				scan.next();
				continue;
			}
			
			switch(num) {
				case 1: bp.deposit(); continue;
				
				case 2: bp.withdraw(); continue;
				
				case 3: bp.getBalance(); continue;
				
				case 4: System.out.println("���� ���α׷� ����"); break;
				
				default : System.out.println("1~4������ ���ڸ� �Է��ϼ���."); continue;
			}
			break;
		}
	}
}