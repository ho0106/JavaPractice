package kunsan.yongho.inheritance;

public class Person {
	int citizenNumber;
	String name;
	int birthYear;
	
	String toString(String str) {
		str = citizenNumber + name + birthYear;
		//System.out.printf("%d %s %d %d\n", citizenNumber,name,birthYear);
		//System.out.println();
		return str;
	}
}
