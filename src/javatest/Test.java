package javatest;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	static Test test = new Test();
	static Scanner scan = new Scanner(System.in);

	public void printMenu() {
		System.out.println("Practice #1 - �µ� ��ȭ");
		System.out.println("Practice #2 - �հ� ���ϱ�");
		System.out.println("Practice #3 - ������");
		System.out.println("Practice #4 - ���� ���");
		System.out.println("Practice #5 - ���� ���");
		System.out.println("Practice #6 - �հ�ȭ ���");
		System.out.println("Practice #7 - ������ �հ�� ���");
		System.out.println("Practice #8 - ��ҹ��� ��ȯ");
		System.out.println("Practice #9 - ������ ��ȣ");
		System.out.println("Practice #10 - �հ� ���� �޼ҵ�");
		System.out.println("Practice #11 - ��Ģ���� �޼ҵ�");
		System.out.println("Practice #12 - �ﰢ�� Ŭ����");
		System.out.println("Practice #13.1 - ��Ģ���� Ŭ����");
		System.out.println("Practice #13.2 - ��Ģ���� Generic class");
		System.out.println("Practice #14 - �ڵ��� Ŭ����");
		System.out.println("Practice #15 - �׸��� �������̽�");
		System.out.println("Practice #16 - Employee class ���");
		System.out.println("Practice #17 - Parsing");
		System.out.print("Practice #_ ���� : ");
	}

	public void runMenu() {
		while (true) {
			test.printMenu();
			String num;

			try {
				num = scan.next();
			} catch (InputMismatchException e) {
				System.out.println(e);
				scan.next();
				continue;
			}

			switch (num) {
			case "1":
				test.convTemp();
				continue;
			case "2":
				test.sum();
				continue;
			case "3":
				test.printGugu();
				continue;
			case "4":
				test.printStar();
				continue;
			case "5":
				test.calcScore();
				continue;
			case "6":
				test.arrAvg();
				continue;
			case "7":
				test.mArr();
				continue;
			case "8":
				continue;
			case "9":
				continue;
			case "10":
				continue;
			case "11":
				continue;
			case "12":
				continue;
			case "13.1":
				continue;
			case "13.2":
				continue;
			case "14":
				continue;
			case "15":
				continue;
			case "16":
				continue;
			case "17":
				continue;
			case "0":
				System.out.println("����.");
				break;
			default:
				System.out.println("1~17������ ��ȣ ����.(0�� ����.)");
				continue;
			}
			break;
		}
	}

	public void convTemp() {
		double c = 31.5;
		double f = (double) 9 / 5 * c + 32;
		System.out.println("���� : " + c);
		System.out.println("ȭ�� : " + f);

	}

	public void sum() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("�հ� : " + sum);
	}

	public void gugu3Dan() {
		for (int i = 2; i < 10; i++) {
			System.out.println("** " + i + "�� **");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println();
		}
	}

	public void printGugu() {
		for (int i = 2; i < 10; i++) {
			System.out.println("** " + i + "�� **");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println();
		}
	}

	public void printStar() {
		System.out.print("Enter line number : ");
		int number = scan.nextInt();
		for (int i = 1; i <= number; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void calcScore() {
		System.out.print("���� �Է� : ");
		int score = scan.nextInt();
		switch (score / 10) {
		case 9:
			System.out.println("���� : A");
			break;
		case 8:
			System.out.println("���� : B");
			break;
		case 7:
			System.out.println("���� : C");
			break;
		case 6:
			System.out.println("���� : D");
			break;
		default:
			System.out.println("���� : F");
			break;
		}
	}

	public void arrAvg() {
		System.out.println("�հ�� ���");

		int[] arry = { 90, 75, 85, 95, 70, 75, 85, 85, 95, 72 };
		int sum = 0;

		for (int add : arry) {
			sum += add;
		}
		System.out.println("���� : " + Arrays.toString(arry));
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + (double) sum / arry.length);
	}
	
	public void mArr() {
		int sum = 0;
		int[][] arry = {
				{90, 80, 80},
				{85, 85, 95},
				{95, 70, 75},
				{80, 80, 90},
				{90, 75, 80}};
		
		for(int row = 0;row < arry.length; row++) {
			for(int column = 0; column < arry[row].length; column++) {
				sum += arry[row][column];
				//System.out.println(arry[column].length);
				//System.out.println(arry[row].length);
			}
			System.out.printf("ID-" + row + ": �հ�=" + sum + ", ���= %.2f\n",  (float)sum/arry[row].length);
			sum = 0;
		}
	}

	public static void main(String[] args) {
		test.runMenu();
	}

}
