package kunsan.yongho.javatest;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentScore {
	
	Scanner scan = new Scanner(System.in);
	
	public void viewList() { //����Ʈ ���
		System.out.println("<�л� ���� ó�� ���α׷�>");
		System.out.println("\t1) �л� ���� �Է�");
		System.out.println("\t2) �л� ��ü ���� ����Ʈ ����");
		System.out.println("\t3) �л��� ��ȣ�� ���� ����");
		System.out.println("\t4) ���� �ְ� ����, ���� ���� ����");
		System.out.println("\t5) ���� ��� ����, ������ ���� ����");
		System.out.println("\t6) ���� �����ؼ� ����");
		System.out.println("\t0) ���� �޴��� ���ư�(����)");
		System.out.print("�Է� : ");
	}
	
	public void studentMenu() { //�޴� �۵�

		StudentScore ss = new StudentScore();
		int[] score = null;
		int[] sorted = null;
		
		while (true) {
			ss.viewList();
			int num;
			
			try {
				num = scan.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.\n1~6������ ���ڸ� �Է��ϼ���.(0�� ����)\n" + e);
				scan.next();
				continue;
			}
			
			switch (num) {
				case 1: score = ss.saveScore(score); continue;
				case 2: ss.viewScore(score); continue;
				case 3: ss.searchScore(score); continue;
				case 4: ss.maxminScore(score); continue;
				case 5: ss.averageScore(score); continue;
				case 6: sorted = ss.sortScore(score); continue;
				case 0: System.out.println("���� �޴��� �����մϴ�."); break;
				default : System.out.println("�߸� �Է��ϼ̽��ϴ�.\n1~6������ ���ڸ� �Է��ϼ���.(0�� ����)\n"); continue;
			}
			break;
		}
	}
	
	public int[] saveScore(int[] score) {
		
		int student = 0;
		
		while(true) {
			System.out.print("ó���� �л��� ���� �Է��ϼ���(�ִ�100��) : ");
			try {
				student = scan.nextInt();
				if (student > 10) {
					System.out.println("�ִ� �л����� 10������ ���ѵǾ��ֽ��ϴ�.");
					return saveScore(score);
				}
			} catch (InputMismatchException e) {
				System.out.println("������ �Է��ϼ���." + e);
				scan.next();
				continue;
			}
			break;
		}
		
		int inScore[] = new int[student];
		
		for (int i = 0; i < student; i++) {
			System.out.print((i+1) + "�� �л� ���� : ");
			inScore[i] = scan.nextInt();
			
			if (inScore[i] > 100) {
				System.out.println("100�� �̻��� �Է��Ͻ� �� �����ϴ�.");
				return null;
			}
		}
		return inScore;
	}
	
	public int[] viewScore(int[] score) {
		int i = 1;
		System.out.println("- ��ü �л����� ����Ʈ ���� -");
		if (score == null) {
			System.out.println("����� �ڷᰡ �����ϴ�.");
			return null;
		}
		
		for (int view : score) {
			System.out.println(i + " : " + view);
			i++;
		}
		return score;
	}
	
	public int[] searchScore(int[] score) {
		if (score == null) {
			System.out.println("����� �ڷᰡ �����ϴ�.");
			return null;
		}
		
		System.out.print("�˻��� �л��� ��ȣ�� �Է��ϼ��� : ");
		
		try {
			int i = scan.nextInt();
			System.out.println(i + " �� �л��� ������ " + score[i-1] + " �Դϴ�.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� �ε����� ������ ������ϴ�. ���� : " + score.length + "\n" + e);
		} catch (InputMismatchException a) {
			System.out.println("�˻��� �л��� ��ȣ�� ������ �Է��ϼ���. �л��� �� : " + score.length + "��\n" + a);
			scan.next();
		}
		return score;
	}
	
	public int[] maxminScore(int[] score) {
		if (score == null) {
			System.out.println("����� �ڷᰡ �����ϴ�.");
			return null;
		}
		
		int max = score[0], min = score[0];
		for (int i = 0; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}
		}
		System.out.println("�ְ� ���� : " + max);
		System.out.println("���� ���� : " + min);
		return score;
	}
	
	public int[] averageScore(int[] score) {
		if (score == null) {
			System.out.println("����� �ڷᰡ �����ϴ�.");
			return null;
		}
		
		int[] sortedScore = null;
		int sum = 0;
		int size = score.length;
		double med;
		
		sortedScore = score.clone();
		Arrays.sort(sortedScore);
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		if (size % 2 == 0) {
			int a = size / 2;
			int b = size / 2-1;
			med = (double)(sortedScore[a] + sortedScore[b]) / 2;
		} else {
			int a = size / 2;
			med = sortedScore[a];
		}
		
		
		System.out.println("��� ���� : " + (double)sum/score.length);
		System.out.println("������ ���� : " + med);
		return score;
	}
	
	public int[] sortScore(int[] score) {
		if (score == null) {
			System.out.println("����� �ڷᰡ �����ϴ�.");
			return null;
		}
		
		int[] sortedScore = null;
		
		sortedScore = score.clone();
		Arrays.sort(sortedScore);
		try {
			for (int i=0; i<sortedScore.length; i++) {
				System.out.println((i+1) + " : " + sortedScore[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		return sortedScore;
	}
}
