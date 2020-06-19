package kunsan.yongho.inheritance;

import java.util.Scanner;

public class Student extends Person {
	int studentNumber;
	String department;

	@Override
	public void setData() {
		Scanner scan = new Scanner(System.in);
		System.out.println("주민번호, 이름, 출생년도, 학번, 학과");
		citizenNumber = scan.nextInt();
		name = scan.next();
		birthYear = scan.nextInt();
		studentNumber = scan.nextInt();
		department = scan.next();
	}

	@Override
	String toString(String formatter) {

		formatter = "%d %s %d %d %s";
		return String.format(formatter, citizenNumber, name, birthYear, studentNumber, department);
	}
}