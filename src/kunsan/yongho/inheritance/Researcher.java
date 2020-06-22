package kunsan.yongho.inheritance;

public class Researcher extends Person {
	int employeeNumber;
	String department;

	public Researcher(int citizenNumber, String name, int birthYear, int employeeNumber, String department) {
		super(citizenNumber, name, birthYear);
		this.employeeNumber = employeeNumber;
		this.department = department;
	}

	@Override
	public String toString() {
		return super.toString() + " " + employeeNumber + " " + department;
	}

}
