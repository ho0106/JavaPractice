package kunsan.yongho.javatest;

public class ViewAZ {
	public void printAToZ() {
		char a = 'A';
		
		do {
			System.out.print(a);
			a = (char)(a + 1);
		} while(a <= 'Z');
	}
}
