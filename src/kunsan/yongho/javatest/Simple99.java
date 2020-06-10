package kunsan.yongho.javatest;

public class Simple99 {
	public void print99() {
		int i,j;
		
		for(j = 1; j < 10; j++) {
			System.out.println();
			for(i = 1; i < 10; i++) {
				System.out.print(i + "*" + j + "=" + i*j + "\t");
			}
		}
	}
}
