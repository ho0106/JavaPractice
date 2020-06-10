package kunsan.yongho.javatest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberAverage {
	Scanner scan = new Scanner(System.in);
	public void getAverage() {
		System.out.println("수를 입력하세요.");
		int sum = 0, i, n = 0;
		double div;
		try {
			while((i = scan.nextInt()) != -1) {
				sum += i;
				n++;
		}
			div = sum/n;
			System.out.println("입력된 수의 개수는 " + n + "개이며 평균은 " + div + "입니다.");
		} catch (ArithmeticException e) {
			System.out.println("입력값이 없습니다!\n" + e);
		} catch (InputMismatchException a) {
			System.out.println("정수를 입력해주세요!\n" + a);
		}
	}
}
