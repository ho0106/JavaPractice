package kunsan.yongho.inheritance;

public class Person {
	int citizenNumber;
	String name;
	int birthYear;

	public Person(int citizenNumber, String name, int birthYear) {
		this.citizenNumber = citizenNumber;
		this.name = name;
		this.birthYear = birthYear;
	}

	public String toString() {
		return citizenNumber + " " + name + " " + birthYear;
	}

}
