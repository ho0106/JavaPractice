package kunsan.yongho.inheritance;

import java.util.Scanner;

public class Person {
	int citizenNumber;
	String name;
	int birthYear;

	public void setData() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�ֹι�ȣ, �̸�, ����⵵");
		citizenNumber = scan.nextInt();
		name = scan.next();
		birthYear = scan.nextInt();
	}

	String toString(String formatter) {
		
		formatter = "%d %s %d";
		return String.format(formatter, citizenNumber, name, birthYear);
	}
}