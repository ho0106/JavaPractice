package kunsan.yongho.inheritance;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UniverManagement {
	Scanner scan = new Scanner(System.in);
	Person[] persons = null;

	public void read() {

		System.out.println("몇 명을 입력하시겠습니까?");
		int n = scan.nextInt();
		persons = new Person[n];

		for (int i = 0; i < n; i++) {
			System.out.println("구성원의 형태를 선택하세요.\n1. 일반인 2. 학생 3. 연구원 4. 교수");
			int selection = scan.nextInt();
			System.out.println("정보를 입력하세요.");
			switch (selection) {

			case 1:
				persons[i] = new Person();
				persons[i].citizenNumber = scan.nextInt();
				persons[i].name = scan.next();
				persons[i].birthYear = scan.nextInt();
				continue;

			case 2:
				persons[i] = new Student();
				persons[i].citizenNumber = scan.nextInt();
				persons[i].name = scan.next();
				persons[i].birthYear = scan.nextInt();
				//persons[i].studentNumber = scan.nextInt();
				//persons[i].department = scan.nextLine();
				continue;

			case 3:
				persons[i] = new Researcher();
				persons[i].citizenNumber = scan.nextInt();
				persons[i].name = scan.next();
				persons[i].birthYear = scan.nextInt();
				//persons[i].id_student = scan.nextInt();
				//persons[i].department = scan.nextLine();
				continue;

			case 4:
				persons[i] = new Professor();
				persons[i].citizenNumber = scan.nextInt();
				persons[i].name = scan.next();
				persons[i].birthYear = scan.nextInt();
				//persons[i].id_student = scan.nextInt();
				//persons[i].department = scan.nextLine();
				continue;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
			//persons[i] = null;
			break;
		}
	}

	public void printMenu() {
		System.out.println("1. 대학 구성원 데이터 입력");
		System.out.println("2. 대학 구성원 데이터 전체 출력");
		System.out.println("3. 대학 구성원 데이터 조건 검색");
		System.out.println("4. 대학 구성원 데이터 변경");
		System.out.println("5. 대학 구성원 데이터 삭제");
		System.out.println("0. 종료");
		System.out.print("입력 : ");
	}

	public void runMenu() {
		while (true) {
			printMenu();
			try {
				int selection = scan.nextInt();

				switch (selection) {
				case 1:
					read();
					continue;
				case 2:
					printAll(persons, null);
					continue;
				case 3:
					continue;
				case 4:
					continue;
				case 5:
					continue;
				case 0:
					System.out.println("프로그램을 종료합니다.");
					break;
				default:
					System.out.println("1~5사이의 숫자를 입력해주세요.(0은 종료)");
					continue;
				}
				break;
			} catch (InputMismatchException e) {
				System.out.println(e);
				scan.next();
				continue;
			}
		}
	}

	public void printAll(Person[] plist, String str) { // 전체 출력
		
		for (Person p : plist) {
		if (p instanceof Person)
			System.out.print("일반인 : " + p.toString(str));
		if (p instanceof Student)
			System.out.print("학생 : " + p.toString(str));
		if (p instanceof Researcher)
			System.out.print("연구원 : " + p.toString(str));
		if (p instanceof Professor)
			System.out.print("교수 : " + p.toString(str));
		System.out.println();
		}

	}

	public static void main(String[] args) {
		UniverManagement um = new UniverManagement();
		um.runMenu();
	}

}
