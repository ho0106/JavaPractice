package kunsan.yongho.javatest;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentScore {
	
	Scanner scan = new Scanner(System.in);
	
	public void viewList() { //리스트 출력
		System.out.println("<학생 성적 처리 프로그램>");
		System.out.println("\t1) 학생 성적 입력");
		System.out.println("\t2) 학생 전체 성적 리스트 보기");
		System.out.println("\t3) 학생의 번호로 성적 보기");
		System.out.println("\t4) 성적 최고 점수, 최저 점수 보기");
		System.out.println("\t5) 성적 평균 점수, 중위값 점수 보기");
		System.out.println("\t6) 성적 정렬해서 보기");
		System.out.println("\t0) 메인 메뉴로 돌아감(종료)");
		System.out.print("입력 : ");
	}
	
	public void studentMenu() { //메뉴 작동

		StudentScore ss = new StudentScore();
		int[] score = null;
		int[] sorted = null;
		
		while (true) {
			ss.viewList();
			int num;
			
			try {
				num = scan.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("잘못 입력하셨습니다.\n1~6사이의 숫자를 입력하세요.(0은 종료)\n" + e);
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
				case 0: System.out.println("메인 메뉴로 복귀합니다."); break;
				default : System.out.println("잘못 입력하셨습니다.\n1~6사이의 숫자를 입력하세요.(0은 종료)\n"); continue;
			}
			break;
		}
	}
	
	public int[] saveScore(int[] score) {
		
		int student = 0;
		
		while(true) {
			System.out.print("처리할 학생의 수를 입력하세요(최대100점) : ");
			try {
				student = scan.nextInt();
				if (student > 10) {
					System.out.println("최대 학생수는 10명으로 제한되어있습니다.");
					return saveScore(score);
				}
			} catch (InputMismatchException e) {
				System.out.println("정수를 입력하세요." + e);
				scan.next();
				continue;
			}
			break;
		}
		
		int inScore[] = new int[student];
		
		for (int i = 0; i < student; i++) {
			System.out.print((i+1) + "번 학생 성적 : ");
			inScore[i] = scan.nextInt();
			
			if (inScore[i] > 100) {
				System.out.println("100점 이상은 입력하실 수 없습니다.");
				return null;
			}
		}
		return inScore;
	}
	
	public int[] viewScore(int[] score) {
		int i = 1;
		System.out.println("- 전체 학생성적 리스트 보기 -");
		if (score == null) {
			System.out.println("저장된 자료가 없습니다.");
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
			System.out.println("저장된 자료가 없습니다.");
			return null;
		}
		
		System.out.print("검색할 학생의 번호를 입력하세요 : ");
		
		try {
			int i = scan.nextInt();
			System.out.println(i + " 번 학생의 성적은 " + score[i-1] + " 입니다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 범위를 벗어났습니다. 범위 : " + score.length + "\n" + e);
		} catch (InputMismatchException a) {
			System.out.println("검색할 학생의 번호를 정수로 입력하세요. 학생의 수 : " + score.length + "명\n" + a);
			scan.next();
		}
		return score;
	}
	
	public int[] maxminScore(int[] score) {
		if (score == null) {
			System.out.println("저장된 자료가 없습니다.");
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
		System.out.println("최고 점수 : " + max);
		System.out.println("최저 점수 : " + min);
		return score;
	}
	
	public int[] averageScore(int[] score) {
		if (score == null) {
			System.out.println("저장된 자료가 없습니다.");
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
		
		
		System.out.println("평균 점수 : " + (double)sum/score.length);
		System.out.println("중위값 점수 : " + med);
		return score;
	}
	
	public int[] sortScore(int[] score) {
		if (score == null) {
			System.out.println("저장된 자료가 없습니다.");
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
