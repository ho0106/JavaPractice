package kunsan.yongho.javatest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ForSum {
	
	Scanner scan = new Scanner(System.in);
	public int checkSum(int i, int j) { //오버플로우 체크
		int result = 0;
		try {
			result = Math.multiplyExact(i, j);
		} catch (ArithmeticException e) {
			throw new ArithmeticException("계산 과정중 Exception 발생.");
		}
		return result;
	}
	
	public void calcSum(int i, int j) { //계산식
		int sum = 0;
		if(i<j) {
			for(;i<=j;i++) {
				sum += i;
				System.out.print(i);
			
				if(i<j)
					System.out.print("+");
				else {
					System.out.print("=" + sum);
				}
			}
		} else if (i>j) {
			for (;j<=i;j++) {
				sum += j;
				System.out.print(j);
			
				if(i>j)
					System.out.print("+");
				else {
					System.out.print("=" + sum);
				}
			}
		}
		return;
	}
	
	public void printSum() { //프린트
		ForSum cs = new ForSum();
		
		try {
			System.out.print("정수 두개를 입력해 주세요.\n입력 : ");
		
			int x = scan.nextInt();
			int y = scan.nextInt();
			cs.checkSum(x, y);
			cs.calcSum(x, y);
		} catch (ArithmeticException e) {
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음.\n" + e);
		} catch (InputMismatchException a) {
			System.out.println("정수를 입력해 주세요.\n" + a);
		}
	}
}

