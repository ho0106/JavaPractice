package kunsan.yongho.inheritance;

import java.util.Scanner;

public class Researcher extends Person {
	int employeeNumber;
	String department;

	@Override
	public void setData() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�ֹι�ȣ, �̸�, ����⵵, ����ȣ, �μ�");
		citizenNumber = scan.nextInt();
		name = scan.next();
		birthYear = scan.nextInt();
		employeeNumber = scan.nextInt();
		department = scan.next();
	}

	@Override
	String toString(String formatter) {

		formatter = "%d %s %d %d %s";
		return String.format(formatter, citizenNumber, name, birthYear, employeeNumber, department);
	}
}