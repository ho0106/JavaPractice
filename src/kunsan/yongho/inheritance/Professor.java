package kunsan.yongho.inheritance;

import java.util.Scanner;

public class Professor extends Researcher {
	String position;

	@Override
	public void setData() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�ֹι�ȣ, �̸�, ����⵵, ����ȣ, �μ�, ��å");
		citizenNumber = scan.nextInt();
		name = scan.next();
		birthYear = scan.nextInt();
		employeeNumber = scan.nextInt();
		department = scan.next();

		if (birthYear < 1980) {
			position = "����";
		} else if (birthYear < 1990) {
			position = "�α���";
		} else if (birthYear < 2000) {
			position = "������";
		}
	}

	@Override
	String toString(String formatter) {

		formatter = "%d %s %d %d %s %s";
		return String.format(formatter, citizenNumber, name, birthYear, employeeNumber, department, position);
	}
}