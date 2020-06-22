package kunsan.yongho.inheritance;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainUniver {
	Scanner scan = new Scanner(System.in);

	public void printMenu() { // �޴� ���
		System.out.println("1. ���� ������ ������ �Է�");
		System.out.println("2. ���� ������ ������ ��ü ���");
		System.out.println("3. ���� ������ ������ ���� �˻�");
		System.out.println("4. ���� ������ ������ ����");
		System.out.println("5. ���� ������ ������ ����");
		System.out.println("0. ����");
		System.out.print("�Է� : ");
	}

	public void runMenu() { // �޴� ����
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
					System.out.println("���α׷��� �����մϴ�.");
					break;
				default:
					System.out.println("1~5������ ���ڸ� �Է����ּ���.(0�� ����)");
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

	public static void main(String[] args) { // ���� �Լ�
		MainUniver mu = new MainUniver();
		mu.runMenu();
	}

}
