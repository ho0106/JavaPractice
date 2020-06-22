package kunsan.yongho.inheritance;

public class Professor extends Researcher {

	String position;

	public Professor(int citizenNumber, String name, int birthYear, int employeeNumber, String department) {
		super(citizenNumber, name, birthYear, employeeNumber, department);

		if (birthYear < 1980) {
			position = "교수";
		} else if (birthYear < 1990) {
			position = "부교수";
		} else if (birthYear < 2000) {
			position = "조교수";
		} else {
			position = "직책없음";
		}
	}

	@Override
	public String toString() {
		return super.toString() + " " + position;
	}

}
