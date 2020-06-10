package kunsan.yongho.javatest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuController {
	
	Scanner scan = new Scanner(System.in);
	
	public void printMenu() { //�޴� ���
		MenuController mc = new MenuController();
		while (true) {
			
			mc.printList();
			int num;
			
			try {
				num = scan.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.\n1~7������ ���ڸ� �Է��ϼ���.(0�� ����)\n" + e);
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
				
				case 0: System.out.println("���α׷��� �����մϴ�."); break;
				
				default : System.out.println("�߸� �Է��ϼ̽��ϴ�.\n1~7������ ���ڸ� �Է��ϼ���.(0�� ����)\n"); continue;

			}
			break;
		}
	}
	
	public void menu1() { //Ŀ�Ǹ޴� �������
		CoffeePrice cp = new CoffeePrice();
		cp.calcPrice();
		System.out.println("\n");
	}
	
	public void menu2() { //�Էµ� ���� ��� ���� ����Ʈ
		NumberAverage na = new NumberAverage();
		na.getAverage();
		System.out.println("\n");
	}
	
	public void menu3() { //���ĺ� A TO Z
		ViewAZ az = new ViewAZ();
		az.printAToZ();
		System.out.println("\n");
	}
	
	public void menu4() { //���� x,y �Է¹޾� ���ϴ°����� ���
		ForSum fs = new ForSum();
		fs.printSum();
		System.out.println("\n");
	}
	
	public void menu5() { //�ܼ� ������
		Simple99 s9 = new Simple99();
		s9.print99();
		System.out.println("\n");
	}
	
	public void menu6() { //�������� ������
		Range99 r9 = new Range99();
		r9.printRange99();
		System.out.println("\n");
	}
	
	public void menu7() { //���� �������ȸ
		Bank bp = new Bank();
		bp.bankMenu();
		System.out.println("\n");
	}
	
	public void menu8() { //�л� ����ó�� ���α׷�
		StudentScore ss = new StudentScore();
		ss.studentMenu();
		System.out.println("\n");
	}
	
	public void printList() { //�޴� ����Ʈ ����Ʈ
		System.out.println("\t**������ ���α׷��� �߿��� ������ �Լ��� �����ϼ���.**\n");
		System.out.println("\t1) Ŀ�� �޴��� ������ ������ ����� �ִ� ���α׷�.");
		System.out.println("\t2) �Էµ� ���� ��հ� ���� ���ϱ� �ؼ� ȭ�鿡 ����Ʈ�ϱ�.");
		System.out.println("\t3) ���ĺ� A����Z���� ����Ʈ �ϱ�.");
		System.out.println("\t4) ���� x�� y�� �Է¹޾�, x���� y���� ���ϴ� ������ ��� ���̱�.");
		System.out.println("\t5) ������ �ܼ� ���.");
		System.out.println("\t6) ������ ��´ܼ��� ���� ���� �����ؼ� ����Ʈ�ϱ�.");
		System.out.println("\t7) ���� ���α׷�.");
		System.out.println("\t8) �л����� ó�� ���α׷�(1���� �迭).");
		System.out.println("\t0) ����");
		System.out.print("���� : ");
	}
		
	public static void main (String[] args) { //����
		
		MenuController mc = new MenuController();
		mc.printMenu();
	}
}