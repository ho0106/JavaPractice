package kunsan.yongho.javatest;

import java.util.Scanner;

public class CoffeePrice {
	
	Scanner scan = new Scanner(System.in);
	
	public void calcPrice() {

		System.out.print("Ŀ�� �޴� ����\n* ���������� *\n* īǪġ�� *\n* ī��� *\n* �Ƹ޸�ī�� *\n���� : ");
		String order = scan.next();
		int price = 0;
		
		switch(order) {
		case "����������" : price = 3500; break;
		case "īǪġ��" : price = 4000; break;
		case "ī���" : price = 3800; break;
		case "�Ƹ޸�ī��" : price = 2000; break;
		default : System.out.println("�޴��� �����ϴ�.");
		}
		if (price != 0)
			System.out.print(order + "�� " + price + "�� �Դϴ�.");
	}
}
