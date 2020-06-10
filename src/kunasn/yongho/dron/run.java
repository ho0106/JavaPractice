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
		System.out.println("1. 로봇 데이터 입력");
		System.out.println("2. 로봇 리스트 보기");
		System.out.println("3. 로봇 모두 이동(상,하,좌,우)");
		System.out.println("4. 개별 로봇 이동");
		System.out.println("5. CleaningRobot 조정");
		System.out.println("6. DogrRobot 조정");
		System.out.println("7. 로봇명으로 검색");
		System.out.println("8. 종료");
		start=scan.nextInt();
		if(start==1){
			System.out.println("제품 종류는?(r: Robot, CleaningRobot: c, DogRobot: d)");
			model=scan.next();
			if(model.equals("r")){
				System.out.print("세부사항 입력: ");
				String name=scan.next();
				robotList[count] = new Robot(name);
				count++;
			}
			if(model.equals("c")){
				System.out.print("세부사항 입력: ");
				String name=scan.next();
				robotList[count] = new CleaningRobot(name);
				count++;
			}
			if(model.equals("d")){
				System.out.print("세부사항 입력: ");
				String name=scan.next();
				robotList[count] = new DogRobot(name);
				count++;
			}
		}
		else if(start==2){
			System.out.println("Robot id \t Robot명 \t X \t Y \t distance \t etc");
			System.out.println("--------------------------------------------------------------------------------");
			for(int i=0;i<count;i++){
			System.out.println(+i+"\t"+robotList[i].robotname+"\t"+robotList[i].x+"\t"+robotList[i].y+"\t"+robotList[i].distance+"\t"+robotList[i].more);
			}
		}
		else if(start==3){
			int a,num;
			System.out.println("로봇 모두 일괄 이동");
			System.out.println("방향으로 이동(1),diff로 이동(2))");
			a=scan.nextInt();
			if(a==1){
				System.out.println("입력(상:1, 하:2, 좌:3, 우:4))");
				num=scan.nextInt();
				if(num==1){
					for(int i=0;i<count;i++){
					System.out.println("로봇 리스트 보기로 상태 확인"+robotList[i].getU());
					}
				}
				else if(num==2){
					for(int i=0;i<count;i++){
					System.out.println("로봇 리스트 보기로 상태 확인"+robotList[i].getD());
					}
				}
				else if(num==3){
					for(int i=0;i<count;i++){
					System.out.println("로봇 리스트 보기로 상태 확인"+robotList[i].getR());
					}
				}
				else if(num==4){
					for(int i=0;i<count;i++){
					System.out.println("로봇 리스트 보기로 상태 확인"+robotList[i].getL());
					}
				}
			}
			else if(a==2){
				System.out.println("입력: ");
				delx=scan.nextInt();
				dely=scan.nextInt();
				System.out.println(+count+"째 로봇의 좌표"+robotList[count].dx+""+robotList[count].dy);
			}
		}
		else if(start==4){
			int picknum,a,num;
			System.out.println("로봇 선택: ");
			picknum=scan.nextInt();
			System.out.println("방향으로 이동(1),diff로 이동(2))");
			a=scan.nextInt();
			if(a==1){
				System.out.println("입력(상:1, 하:2, 좌:3, 우:4))");
				num=scan.nextInt();
				if(num==1){
					System.out.println("로봇 리스트 보기로 상태 확인"+robotList[picknum].getU());
				}
				else if(num==2){
					System.out.println("로봇 리스트 보기로 상태 확인"+robotList[picknum].getD());
				}
				else if(num==3){
					System.out.println("로봇 리스트 보기로 상태 확인"+robotList[picknum].getR());
				}
				else if(num==4){
					System.out.println("로봇 리스트 보기로 상태 확인"+robotList[picknum].getL());
					}
				}
			if(a==2){
				System.out.println("입력: ");
				delx=scan.nextInt();
				dely=scan.nextInt();
				System.out.println(+picknum+"째 로봇의 좌표"+robotList[picknum].dx+""+robotList[picknum].dy);
			}
		}
		else if(start==7){
			String find;
			System.out.println("로봇명으로 검색:");
			find=scan.next();
			for(int i=0;i<count;i++){
				if(robotList[i].robotname.equals(find)){
					System.out.println("Robot id \t Robot명 \t X \t Y \t distance \t etc");
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
