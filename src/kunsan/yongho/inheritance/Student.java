package kunsan.yongho.inheritance;

public class Student extends Person{
	int studentNumber;
	String department;
	
	String toString(String str) {
		str = citizenNumber + name + birthYear;
		//System.out.printf("%d %s %d %d\n", citizenNumber,name,birthYear);
		//System.out.println();
		return str;
	}
}
