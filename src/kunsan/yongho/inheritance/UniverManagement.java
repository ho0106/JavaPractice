package kunsan.yongho.inheritance;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UniverManagement {
	Scanner scan = new Scanner(System.in);
	Person[] persons = null;

	public void read() {

		System.out.println("�� ���� �Է��Ͻðڽ��ϱ�?");
		int n = scan.nextInt();
		persons = new Person[n];

		for (int i = 0; i < n; i++) {
			System.out.println("�������� ���¸� �����ϼ���.\n1. �Ϲ��� 2. �л� 3. ������ 4. ����");
			int selection = scan.nextInt();
			System.out.println("������ �Է��ϼ���.");
			switch (selection) {

			case 1:
				persons[i] = new Person();
				persons[i].citizenNumber = scan.nextInt();
				persons[i].name = scan.next();
				persons[i].birthYear = scan.nextInt();
				continue;

			case 2:
				persons[i] = new Student();
				persons[i].citizenNumber = scan.nextInt();
				persons[i].name = scan.next();
				persons[i].birthYear = scan.nextInt();
				//persons[i].studentNumber = scan.nextInt();
				//persons[i].department = scan.nextLine();
				continue;

			case 3:
				persons[i] = new Researcher();
				persons[i].citizenNumber = scan.nextInt();
				persons[i].name = scan.next();
				persons[i].birthYear = scan.nextInt();
				//persons[i].id_student = scan.nextInt();
				//persons[i].department = scan.nextLine();
				continue;

			case 4:
				persons[i] = new Professor();
				persons[i].citizenNumber = scan.nextInt();
				persons[i].name = scan.next();
				persons[i].birthYear = scan.nextInt();
				//persons[i].id_student = scan.nextInt();
				//persons[i].department = scan.nextLine();
				continue;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				break;
			}
			//persons[i] = null;
			break;
		}
	}

	public void printMenu() {
		System.out.println("1. ���� ������ ������ �Է�");
		System.out.println("2. ���� ������ ������ ��ü ���");
		System.out.println("3. ���� ������ ������ ���� �˻�");
		System.out.println("4. ���� ������ ������ ����");
		System.out.println("5. ���� ������ ������ ����");
		System.out.println("0. ����");
		System.out.print("�Է� : ");
	}

	public void runMenu() {
		while (true) {
			printMenu();
			try {
				int selection = scan.nextInt();

				switch (selection) {
				case 1:
					read();
					continue;
				case 2:
					printAll(persons, null);
					continue;
				case 3:
					continue;
				case 4:
					continue;
				case 5:
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

	public void printAll(Person[] plist, String str) { // ��ü ���
		
		for (Person p : plist) {
		if (p instanceof Person)
			System.out.print("�Ϲ��� : " + p.toString(str));
		if (p instanceof Student)
			System.out.print("�л� : " + p.toString(str));
		if (p instanceof Researcher)
			System.out.print("������ : " + p.toString(str));
		if (p instanceof Professor)
			System.out.print("���� : " + p.toString(str));
		System.out.println();
		}

	}

	public static void main(String[] args) {
		UniverManagement um = new UniverManagement();
		um.runMenu();
	}

}
