package kunsan.yongho.javatest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Range99 {
	Scanner scan = new Scanner(System.in);
	
	public int checkRange99(int i, int j) { //�����÷ο� üũ
		int result = 0;
		try {
			result = Math.multiplyExact(i, j);
		} catch (ArithmeticException e) {
			throw new ArithmeticException("��� ������ Exception �߻�");
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
	
	public void printRange99() { //������ ���
		Range99 cr = new Range99();
		
		try {
			System.out.println("�� �� ���� �� �� ���� �������� ����ұ��?(int, int)");
			int start = scan.nextInt();
			int end = scan.nextInt();
			System.out.println("��� �� ���� ��� �� ���� ���ұ��?(int, int)");
			int from = scan.nextInt();
			int to = scan.nextInt();
		
		
			cr.checkRange99(end, to);
			cr.calcRange99(start, end, from, to);
		} catch (ArithmeticException e) {
			System.out.println("�����÷ο찡 �߻��Ͽ� ��Ȯ�ϰ� ����� �� ����.\n" + e);
		} catch (InputMismatchException a) {
			System.out.println("������ �Է��� �ּ���.\n" + a);
		}
	}
}
