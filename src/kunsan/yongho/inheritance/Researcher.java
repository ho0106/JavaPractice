package kunsan.yongho.inheritance;

public class Researcher extends Person {
	int employeeNumber;
	String department;
	
	String printString() {
		System.out.println(citizenNumber + name + birthYear + employeeNumber + department);
		return null;
	}

}
