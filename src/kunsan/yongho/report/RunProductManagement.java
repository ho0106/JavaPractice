package kunsan.yongho.report;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RunProductManagement {
	Scanner scan = new Scanner(System.in);

	public void printMenu() {
		System.out.println("1. ��ǰ ������ �Է�\t2. ��ǰ����Ʈ ����(��¥�� ����)\t3. ���� ��ǰ���� �ݾ� ����");
		System.out.println("4. ��� ��ǰ ���� �ϰ� ����\t5. ���� ������ �˻�(���ݼ�)\t6. �԰�¥�� �˻�\t7. ��ǰ ����");
		System.out.print("8. ����\t���� : ");
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
					System.out.println("���α׷��� �����մϴ�.");
					break;
				default:
					System.out.println("1~7������ ���ڸ� �Է����ּ���.(8�� ����)");
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