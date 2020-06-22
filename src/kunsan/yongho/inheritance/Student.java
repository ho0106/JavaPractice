package kunsan.yongho.inheritance;

public class Student extends Person {
	int studentNumber;
	String department;

	public Student(int citizenNumber, String name, int birthYear, int studentNumber, String department) {
		super(citizenNumber, name, birthYear);
		this.studentNumber = studentNumber;
		this.department = department;
	}

	@Override
	public String toString() {
		return super.toString() + " " + studentNumber + " " + department;
	}

}
