package kunsan.yongho.javatest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberAverage {
	Scanner scan = new Scanner(System.in);
	public void getAverage() {
		System.out.println("���� �Է��ϼ���.");
		int sum = 0, i, n = 0;
		double div;
		try {
			while((i = scan.nextInt()) != -1) {
				sum += i;
				n++;
		}
			div = sum/n;
			System.out.println("�Էµ� ���� ������ " + n + "���̸� ����� " + div + "�Դϴ�.");
		} catch (ArithmeticException e) {
			System.out.println("�Է°��� �����ϴ�!\n" + e);
		} catch (InputMismatchException a) {
			System.out.println("������ �Է����ּ���!\n" + a);
		}
	}
}
