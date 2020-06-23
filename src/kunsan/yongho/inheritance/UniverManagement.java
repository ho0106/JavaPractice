package kunsan.yongho.inheritance;

//import java.util.InputMismatchException;
import java.util.Scanner;

public class UniverManagement {
	Scanner scan = new Scanner(System.in);

	public Person[] inputInfomation(Person[] persons) { // 데이터 입력

		System.out.println("몇 명을 입력하시겠습니까?");
		int n = scan.nextInt();
		persons = new Person[n];

		for (int i = 0; i < n; i++) {
			System.out.println("구성원의 형태를 선택하세요.\n1. 일반인 2. 학생 3. 연구원 4. 교수");
			int selection = scan.nextInt();
			System.out.println("정보를 입력하세요.");
			switch (selection) {

			case 1: // 일반인
				System.out.println("주민번호 이름 생년월일");
				persons[i] = new Person(scan.nextInt(), scan.next(), scan.nextInt());
				continue;

			case 2: // 학생
				System.out.println("주민번호 이름 생년월일 학번 학과");
				persons[i] = new Student(scan.nextInt(), scan.next(), scan.nextInt(), scan.nextInt(), scan.next());
				continue;

			case 3: // 연구원
				System.out.println("주민번호 이름 생년월일 고용번호 부서");
				persons[i] = new Researcher(scan.nextInt(), scan.next(), scan.nextInt(), scan.nextInt(), scan.next());
				continue;

			case 4: // 교수
				System.out.println("주민번호 이름 생년월일 고용번호 부서");
				persons[i] = new Professor(scan.nextInt(), scan.next(), scan.nextInt(), scan.nextInt(), scan.next());
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

	public Person[] printAll(Person[] plist) { // 전체 출력

		for (Person p : plist) {

			if (p instanceof Professor) {
				System.out.print("교수 : " + p.toString());
			} else if (p instanceof Researcher) {
				System.out.print("연구원 : " + p.toString());
			} else if (p instanceof Student) {
				System.out.print("학생 : " + p.toString());
			} else if (p instanceof Person) {
				System.out.print("일반인 : " + p.toString());
			}

			System.out.println();
		}
		return plist;
	}

	public Person[] searchData(Person[] persons, int currentYear) { // 데이터 조건 검색
		while (true) {
			System.out.println("다음중에 선택하세요.\n1. 이름으로 검색 2. 나이로 검색");
			int selection = scan.nextInt();

			switch (selection) {
			case 1:
				System.out.print("검색할 이름 입력 : ");
				String searchName = scan.next();
				for (int i = 0; i < persons.length; i++) {
					if (searchName.equals(persons[i].name)) {
						System.out.println(persons[i].toString());
					}
				}
				break;
			case 2:
				System.out.println("나이 범위 입력 : ");
				int startAge = scan.nextInt();
				int endAge = scan.nextInt();
				for (int i = 0; i < persons.length; i++) {
					if ((currentYear - persons[i].birthYear) > startAge
							&& (currentYear - persons[i].birthYear) < endAge) {
						System.out.println(persons[i].toString());
					}
				}
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			break;
		}
		return persons;
	}

	public Person[] updateData(Person[] persons) { // 데이터 변경
		while (true) {
			System.out.print("수정할 사람 : ");
			String searchName = scan.next();

			for (int search = 0; search < persons.length; search++) {
				if (searchName.equals(persons[search].name)) {
					System.out.println("1. 이름 수정 2. 생년월일 수정");
					int selection = scan.nextInt();

					switch (selection) {

					case 1:
						System.out.print("변경할 이름 : ");
						String updateName = scan.next();
						persons[search].name = updateName;
						break;
					case 2:
						System.out.print("변경할 생년월일 : ");
						int updatebirthYear = scan.nextInt();
						persons[search].birthYear = updatebirthYear;
						break;
					default:
						System.out.println("잘못 입력하셨습니다.");
						continue;
					}
				}
			}
			break;
		}
		return persons;
	}

	public Person[] removeData(Person[] persons) { // 데이터 삭제
		System.out.print("삭제할 구성원 선택 : ");
		String removeName = scan.next();
		Person[] newPerson = new Person[persons.length - 1];

		for (int i = 0; i < persons.length; i++) {
			if (removeName.equals(persons[i].name)) {
				System.arraycopy(persons, 0, newPerson, 0, i);
				System.arraycopy(persons, i + 1, newPerson, i, persons.length - i - 1);
			}
		}
		return newPerson;
	}

}