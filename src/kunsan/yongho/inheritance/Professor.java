package kunsan.yongho.inheritance;

public class Professor extends Researcher {
	String position;
	
	String printString() {
		System.out.println(citizenNumber + name + birthYear + employeeNumber + department + position);
		return null;
	}

}
