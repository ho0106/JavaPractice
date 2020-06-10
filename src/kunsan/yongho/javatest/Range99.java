package kunsan.yongho.javatest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Range99 {
	Scanner scan = new Scanner(System.in);
	
	public int checkRange99(int i, int j) { //오버플로우 체크
		int result = 0;
		try {
			result = Math.multiplyExact(i, j);
		} catch (ArithmeticException e) {
			throw new ArithmeticException("계산 과정증 Exception 발생");
		}
		return result;
	}
	
	public void calcRange99(int start, int end, int from, int to) {
		int i,j;
		for (j = from; j <= to; j++, System.out.println())  {
			for (i = start; i <= end; i++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
		}
		return;
	}
	
	public void printRange99() { //구구단 출력
		Range99 cr = new Range99();
		
		try {
			System.out.println("몇 단 부터 몇 단 까지 구구단을 출력할까요?(int, int)");
			int start = scan.nextInt();
			int end = scan.nextInt();
			System.out.println("어느 수 부터 어느 수 까지 곱할까요?(int, int)");
			int from = scan.nextInt();
			int to = scan.nextInt();
		
		
			cr.checkRange99(end, to);
			cr.calcRange99(start, end, from, to);
		} catch (ArithmeticException e) {
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음.\n" + e);
		} catch (InputMismatchException a) {
			System.out.println("정수를 입력해 주세요.\n" + a);
		}
	}
}
