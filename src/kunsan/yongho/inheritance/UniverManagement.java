package kunsan.yongho.inheritance;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UniverManagement {
	Scanner scan = new Scanner(System.in);
	Person[] persons = null;

	public Person[] inputInfomation(Person[] persons) {

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
				persons[i].setData();
				continue;

			case 2:
				persons[i] = new Student();
				persons[i].setData();
				continue;

			case 3:
				persons[i] = new Researcher();
				persons[i].setData();
				continue;

			case 4:
				persons[i] = new Professor();
				persons[i].setData();
				continue;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
			break;
		}
		System.out.println("입력이 완료되었습니다.");
		return persons;
	}

	public Person[] printAll(Person[] plist, String formatter) { // 전체 출력

		for (Person p : plist) {

			if (p instanceof Professor) {
				System.out.print("교수 : " + p.toString(formatter));
			} else if (p instanceof Researcher) {
				System.out.print("연구원 : " + p.toString(formatter));
			} else if (p instanceof Student) {
				System.out.print("학생 : " + p.toString(formatter));
			} else if (p instanceof Person) {
				System.out.print("일반인 : " + p.toString(formatter));
			}

			System.out.println();
		}
		return plist;
	}

	public Person[] searchData(Person[] persons) {
		while (true) {
			System.out.println("다음중에 선택하세요.\n1. 이름으로 검색 2. 나이로 검색");
			int selection = scan.nextInt();
			
			switch (selection) {
			case 1:
				System.out.print("검색할 이름 입력 : ");
				String searchName = scan.next();
				for (int i = 0; i <persons.length; i++) {
					if (searchName.equals(persons[i])) {
						System.out.println("출력.");
					}
				}
				break;
			case 2:
				System.out.println("나이 범위 입력 : ");
				break;
				default : System.out.println("잘못 입력하셨습니다."); continue;
			}
			break;
		}
		return persons;
	}
	
	public Person[] updateData(Person[] persons) {
		System.out.print("변경할 구성원 선택 : ");
		
		return persons;
	}
	
	public Person[] removeData(Person[] persons) {
		System.out.print("삭제할 구성원 선택 : ");
		return persons;
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
		UniverManagement um = new UniverManagement();
		Person[] persons = null;
		while (true) {
			printMenu();
			try {
				int selection = scan.nextInt();

				switch (selection) {
				case 1:
					persons = um.inputInfomation(persons);
					continue;
				case 2:
					um.printAll(persons, null);
					continue;
				case 3:
					um.searchData(persons);
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

	public static void main(String[] args) {
		UniverManagement um = new UniverManagement();
		um.runMenu();
	}

}
