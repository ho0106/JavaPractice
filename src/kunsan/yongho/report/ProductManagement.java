package kunsan.yongho.report;

import java.util.Scanner;

public class ProductManagement {
	Scanner scan = new Scanner(System.in);

	public void insertProduct() {
		while (true) {
			System.out.print("��ǰ ������? (c: CPU, r: �����, a: �����) : ");
			String choice = scan.next();
			
			switch(choice) {
			case "c" :
				continue;
			case "r" :
				continue;
			case "a" :
				continue;
				default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �޴��� ���ư��ϴ�.");
			}
		}
	}

}
