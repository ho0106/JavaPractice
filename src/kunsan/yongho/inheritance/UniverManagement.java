package kunsan.yongho.inheritance;

//import java.util.InputMismatchException;
import java.util.Scanner;

public class UniverManagement {
	Scanner scan = new Scanner(System.in);

	public Person[] inputInfomation(Person[] persons) { // ������ �Է�

		System.out.println("�� ���� �Է��Ͻðڽ��ϱ�?");
		int n = scan.nextInt();
		persons = new Person[n];

		for (int i = 0; i < n; i++) {
			System.out.println("�������� ���¸� �����ϼ���.\n1. �Ϲ��� 2. �л� 3. ������ 4. ����");
			int selection = scan.nextInt();
			System.out.println("������ �Է��ϼ���.");
			switch (selection) {

			case 1: // �Ϲ���
				System.out.println("�ֹι�ȣ �̸� �������");
				persons[i] = new Person(scan.nextInt(), scan.next(), scan.nextInt());
				continue;

			case 2: // �л�
				System.out.println("�ֹι�ȣ �̸� ������� �й� �а�");
				persons[i] = new Student(scan.nextInt(), scan.next(), scan.nextInt(), scan.nextInt(), scan.next());
				continue;

			case 3: // ������
				System.out.println("�ֹι�ȣ �̸� ������� ����ȣ �μ�");
				persons[i] = new Researcher(scan.nextInt(), scan.next(), scan.nextInt(), scan.nextInt(), scan.next());
				continue;

			case 4: // ����
				System.out.println("�ֹι�ȣ �̸� ������� ����ȣ �μ�");
				persons[i] = new Professor(scan.nextInt(), scan.next(), scan.nextInt(), scan.nextInt(), scan.next());
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

	public Person[] printAll(Person[] plist) { // ��ü ���

		for (Person p : plist) {

			if (p instanceof Professor) {
				System.out.print("���� : " + p.toString());
			} else if (p instanceof Researcher) {
				System.out.print("������ : " + p.toString());
			} else if (p instanceof Student) {
				System.out.print("�л� : " + p.toString());
			} else if (p instanceof Person) {
				System.out.print("�Ϲ��� : " + p.toString());
			}

			System.out.println();
		}
		return plist;
	}

	public Person[] searchData(Person[] persons, int currentYear) { // ������ ���� �˻�
		while (true) {
			System.out.println("�����߿� �����ϼ���.\n1. �̸����� �˻� 2. ���̷� �˻�");
			int selection = scan.nextInt();

			switch (selection) {
			case 1:
				System.out.print("�˻��� �̸� �Է� : ");
				String searchName = scan.next();
				for (int i = 0; i < persons.length; i++) {
					if (searchName.equals(persons[i].name)) {
						System.out.println(persons[i].toString());
					}
				}
				break;
			case 2:
				System.out.println("���� ���� �Է� : ");
				int startAge = scan.nextInt();
				int endAge = scan.nextInt();
				for (int i = 0; i < persons.length; i++) {
					if ((currentYear - persons[i].birthYear) > startAge
							&& (currentYear - persons[i].birthYear) < endAge) {
						System.out.println(persons[i].toString());
					}
				}
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				continue;
			}
			break;
		}
		return persons;
	}

	public Person[] updateData(Person[] persons) { // ������ ����
		while (true) {
			System.out.print("������ ��� : ");
			String searchName = scan.next();

			for (int search = 0; search < persons.length; search++) {
				if (searchName.equals(persons[search].name)) {
					System.out.println("1. �̸� ���� 2. ������� ����");
					int selection = scan.nextInt();

					switch (selection) {

					case 1:
						System.out.print("������ �̸� : ");
						String updateName = scan.next();
						persons[search].name = updateName;
						break;
					case 2:
						System.out.print("������ ������� : ");
						int updatebirthYear = scan.nextInt();
						persons[search].birthYear = updatebirthYear;
						break;
					default:
						System.out.println("�߸� �Է��ϼ̽��ϴ�.");
						continue;
					}
				}
			}
			break;
		}
		return persons;
	}

	public Person[] removeData(Person[] persons) { // ������ ����
		System.out.print("������ ������ ���� : ");
		String removeName = scan.next();
		Person[] newPerson = new Person[persons.length - 1];

		for (int i = 0; i < persons.length; i++) {
			if (removeName.equals(persons[i].name)) {
				System.arraycopy(persons, 0, newPerson, 0, i);
				System.arraycopy(persons, i + 1, newPerson, i, persons.length - i - 1);
			}
		}
		return newPerson;
	}

}