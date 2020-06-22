package kunsan.yongho.inheritance;

public class Professor extends Researcher {

	String position;

	public Professor(int citizenNumber, String name, int birthYear, int employeeNumber, String department) {
		super(citizenNumber, name, birthYear, employeeNumber, department);

		if (birthYear < 1980) {
			position = "����";
		} else if (birthYear < 1990) {
			position = "�α���";
		} else if (birthYear < 2000) {
			position = "������";
		} else {
			position = "��å����";
		}
	}

	@Override
	public String toString() {
		return super.toString() + " " + position;
	}

}
