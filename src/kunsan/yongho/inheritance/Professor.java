package kunsan.yongho.inheritance;

import java.util.Scanner;

public class Professor extends Researcher {
	String position;

	@Override
	public void setData() {
		Scanner scan = new Scanner(System.in);
		System.out.println("주민번호, 이름, 출생년도, 고용번호, 부서, 직책");
		citizenNumber = scan.nextInt();
		name = scan.next();
		birthYear = scan.nextInt();
		employeeNumber = scan.nextInt();
		department = scan.next();

		if (birthYear < 1980) {
			position = "교수";
		} else if (birthYear < 1990) {
			position = "부교수";
		} else if (birthYear < 2000) {
			position = "조교수";
		}
	}

	@Override
	String toString(String formatter) {

		formatter = "%d %s %d %d %s %s";
		return String.format(formatter, citizenNumber, name, birthYear, employeeNumber, department, position);
	}
}