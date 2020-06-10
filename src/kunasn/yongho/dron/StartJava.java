package kunasn.yongho.dron;

public class StartJava {
	
	public void printHello() {
		System.out.println("\n********** Hello World! **********");
		
		//int myVariable1 = 42332200000;
		long myVariavble2 = 42332200000L;
		
		int decNumber = 34;
		int hexNumber = 0x2F;
		int binNumber = 0b10010;
		
		System.out.println(myVariavble2);
	}
	
	public void DoubleExample() {
		double myDouble = 3.4;
		float myFloat = 3.4F;
		
		// 3.445*10 ^ 2
		
		//ouble myDoubleScientific = 3.445e2;
		
		char myChar = 'g';
		char newLine = '\n';
		String myString = "Java 8";
		
		System.out.println(myDouble);
		System.out.println(myFloat);
		//System.out.println(myDoublecientific);
		System.out.println(myChar);
		System.out.println(newLine);
		System.out.println(myString);
	}
	
	public void assignmentOperator() {
		int number1, number2;
		
		//Assigning 5 to number1
		number1 = 5;
		System.out.println(number1);
		
		//Assigning value of variable number2 to number1
		number2 = number1;
		System.out.println(number2);
	}
	
	public void arithmeticOperator() {
		double number1 = 12.5, number2 = 3.5, result;
		
		//Using addition operator
		result = number1 + number2;
		System.out.println("number1 + number2 = " + result);
		
		//Using subtraction operator
		result = number1 - number2;
		System.out.println("number1 - number2 = " + result);
		
		//Using multiplication operator
		result = number1 * number2;
		System.out.println("number1 * number2 = " + result);
		
		//Using division operator
		result = number1 / number2;
		System.out.println("number1 / number2 = " + result);
		
		//Using remainder operator
		result = number1 % number2;
		System.out.println("number1 % number2 = " + result);
	}
	
	public void instanceofOperator() {
		String test = "asdf";
		boolean result;
		
		result = test instanceof String;
		System.out.println("Is test an objext of String? " + result);
	}
	
	public void logicalOperator() {
		int number1 = 1, number2 = 2, number3 = 9;
		boolean result;
		
		result = (number1 > number2) || (number3 > number1);
		System.out.println(result);
		
		result = (number1 > number2) && (number3 > number1);
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		StartJava a = new StartJava();
		a.printHello();
		a.DoubleExample();
		a.assignmentOperator();
		a.arithmeticOperator();
		a.instanceofOperator();
		a.logicalOperator();
	}
}
