package kunsan.yongho.inheritance;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UniverManagement {
	Scanner scan = new Scanner(System.in);
	Person[] persons = null;

	public Person[] inputInfomation(Person[] persons) {

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
				persons[i].setData();
				continue;

			case 2:
				persons[i] = new Student();
				persons[i].setData();
				continue;

			case 3:
				persons[i] = new Researcher();
				persons[i].setData();
				continue;

			case 4:
				persons[i] = new Professor();
				persons[i].setData();
				continue;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				break;
			}
			break;
		}
		System.out.println("�Է��� �Ϸ�Ǿ����ϴ�.");
		return persons;
	}

	public Person[] printAll(Person[] plist, String formatter) { // ��ü ���

		for (Person p : plist) {

			if (p instanceof Professor) {
				System.out.print("���� : " + p.toString(formatter));
			} else if (p instanceof Researcher) {
				System.out.print("������ : " + p.toString(formatter));
			} else if (p instanceof Student) {
				System.out.print("�л� : " + p.toString(formatter));
			} else if (p instanceof Person) {
				System.out.print("�Ϲ��� : " + p.toString(formatter));
			}

			System.out.println();
		}
		return plist;
	}

	public Person[] searchData(Person[] persons) {
		while (true) {
			System.out.println("�����߿� �����ϼ���.\n1. �̸����� �˻� 2. ���̷� �˻�");
			int selection = scan.nextInt();
			
			switch (selection) {
			case 1:
				System.out.print("�˻��� �̸� �Է� : ");
				String searchName = scan.next();
				for (int i = 0; i <persons.length; i++) {
					if (searchName.equals(persons[i])) {
						System.out.println("���.");
					}
				}
				break;
			case 2:
				System.out.println("���� ���� �Է� : ");
				break;
				default : System.out.println("�߸� �Է��ϼ̽��ϴ�."); continue;
			}
			break;
		}
		return persons;
	}
	
	public Person[] updateData(Person[] persons) {
		System.out.print("������ ������ ���� : ");
		
		return persons;
	}
	
	public Person[] removeData(Person[] persons) {
		System.out.print("������ ������ ���� : ");
		return persons;
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
					um.printAll(persons, null);
					continue;
				case 3:
					um.searchData(persons);
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

	public static void main(String[] args) {
		UniverManagement um = new UniverManagement();
		um.runMenu();
	}

}
