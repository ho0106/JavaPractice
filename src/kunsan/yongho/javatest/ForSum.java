package kunsan.yongho.javatest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ForSum {
	
	Scanner scan = new Scanner(System.in);
	public int checkSum(int i, int j) { //�����÷ο� üũ
		int result = 0;
		try {
			result = Math.multiplyExact(i, j);
		} catch (ArithmeticException e) {
			throw new ArithmeticException("��� ������ Exception �߻�.");
		}
		return result;
	}
	
	public void calcSum(int i, int j) { //����
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
	
	public void printSum() { //����Ʈ
		ForSum cs = new ForSum();
		
		try {
			System.out.print("���� �ΰ��� �Է��� �ּ���.\n�Է� : ");
		
			int x = scan.nextInt();
			int y = scan.nextInt();
			cs.checkSum(x, y);
			cs.calcSum(x, y);
		} catch (ArithmeticException e) {
			System.out.println("�����÷ο찡 �߻��Ͽ� ��Ȯ�ϰ� ����� �� ����.\n" + e);
		} catch (InputMismatchException a) {
			System.out.println("������ �Է��� �ּ���.\n" + a);
		}
	}
}

