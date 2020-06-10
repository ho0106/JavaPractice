package kunasn.yongho.dron;

import java.util.Scanner;
public class run {
	static Robot[] robotList = new Robot[10];
	static Scanner scan = new Scanner(System.in);
	static int delx,dely;
	public static void main(String args[]){
		int start,count=0;
		String model,and;
		while(true){
		System.out.println("1. �κ� ������ �Է�");
		System.out.println("2. �κ� ����Ʈ ����");
		System.out.println("3. �κ� ��� �̵�(��,��,��,��)");
		System.out.println("4. ���� �κ� �̵�");
		System.out.println("5. CleaningRobot ����");
		System.out.println("6. DogrRobot ����");
		System.out.println("7. �κ������� �˻�");
		System.out.println("8. ����");
		start=scan.nextInt();
		if(start==1){
			System.out.println("��ǰ ������?(r: Robot, CleaningRobot: c, DogRobot: d)");
			model=scan.next();
			if(model.equals("r")){
				System.out.print("���λ��� �Է�: ");
				String name=scan.next();
				robotList[count] = new Robot(name);
				count++;
			}
			if(model.equals("c")){
				System.out.print("���λ��� �Է�: ");
				String name=scan.next();
				robotList[count] = new CleaningRobot(name);
				count++;
			}
			if(model.equals("d")){
				System.out.print("���λ��� �Է�: ");
				String name=scan.next();
				robotList[count] = new DogRobot(name);
				count++;
			}
		}
		else if(start==2){
			System.out.println("Robot id \t Robot�� \t X \t Y \t distance \t etc");
			System.out.println("--------------------------------------------------------------------------------");
			for(int i=0;i<count;i++){
			System.out.println(+i+"\t"+robotList[i].robotname+"\t"+robotList[i].x+"\t"+robotList[i].y+"\t"+robotList[i].distance+"\t"+robotList[i].more);
			}
		}
		else if(start==3){
			int a,num;
			System.out.println("�κ� ��� �ϰ� �̵�");
			System.out.println("�������� �̵�(1),diff�� �̵�(2))");
			a=scan.nextInt();
			if(a==1){
				System.out.println("�Է�(��:1, ��:2, ��:3, ��:4))");
				num=scan.nextInt();
				if(num==1){
					for(int i=0;i<count;i++){
					System.out.println("�κ� ����Ʈ ����� ���� Ȯ��"+robotList[i].getU());
					}
				}
				else if(num==2){
					for(int i=0;i<count;i++){
					System.out.println("�κ� ����Ʈ ����� ���� Ȯ��"+robotList[i].getD());
					}
				}
				else if(num==3){
					for(int i=0;i<count;i++){
					System.out.println("�κ� ����Ʈ ����� ���� Ȯ��"+robotList[i].getR());
					}
				}
				else if(num==4){
					for(int i=0;i<count;i++){
					System.out.println("�κ� ����Ʈ ����� ���� Ȯ��"+robotList[i].getL());
					}
				}
			}
			else if(a==2){
				System.out.println("�Է�: ");
				delx=scan.nextInt();
				dely=scan.nextInt();
				System.out.println(+count+"° �κ��� ��ǥ"+robotList[count].dx+""+robotList[count].dy);
			}
		}
		else if(start==4){
			int picknum,a,num;
			System.out.println("�κ� ����: ");
			picknum=scan.nextInt();
			System.out.println("�������� �̵�(1),diff�� �̵�(2))");
			a=scan.nextInt();
			if(a==1){
				System.out.println("�Է�(��:1, ��:2, ��:3, ��:4))");
				num=scan.nextInt();
				if(num==1){
					System.out.println("�κ� ����Ʈ ����� ���� Ȯ��"+robotList[picknum].getU());
				}
				else if(num==2){
					System.out.println("�κ� ����Ʈ ����� ���� Ȯ��"+robotList[picknum].getD());
				}
				else if(num==3){
					System.out.println("�κ� ����Ʈ ����� ���� Ȯ��"+robotList[picknum].getR());
				}
				else if(num==4){
					System.out.println("�κ� ����Ʈ ����� ���� Ȯ��"+robotList[picknum].getL());
					}
				}
			if(a==2){
				System.out.println("�Է�: ");
				delx=scan.nextInt();
				dely=scan.nextInt();
				System.out.println(+picknum+"° �κ��� ��ǥ"+robotList[picknum].dx+""+robotList[picknum].dy);
			}
		}
		else if(start==7){
			String find;
			System.out.println("�κ������� �˻�:");
			find=scan.next();
			for(int i=0;i<count;i++){
				if(robotList[i].robotname.equals(find)){
					System.out.println("Robot id \t Robot�� \t X \t Y \t distance \t etc");
					System.out.println("--------------------------------------------------------------------------------");
					System.out.println(+i+"\t"+robotList[i].robotname+"\t"+robotList[i].x+"\t"+robotList[i].y+"\t"+robotList[i].distance+"\t"+robotList[i].more);
				}
			}
		}
		else if(start==8){
			return;
		}
	}
	}
}
