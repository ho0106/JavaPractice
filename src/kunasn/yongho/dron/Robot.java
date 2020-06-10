package kunasn.yongho.dron;



class Robot {
	String robotname;
	String more;
	int x,y,dx,dy;
	int distance = 5;
	int move;
public Robot(String name){
	this.robotname=name;
	this.x=100;
	this.y=100;
	this.dx=dx;
	this.dy=dy;
	}
public int getU() {
	return y;
	}
public int getD(){
	return y;
}
public int getR(){
	return x;
}
public int getL(){
	return x;
}
public void setL(int x) {
	if(distance==5){
	this.x = x+5;
	}
	else if(distance==3){
		this.x = x+3;
	}
	else if(distance==10){
		this.x = x+10;
	}
	}
public void setR(int x){
	if(distance==5){
	this.x = x-5;
	}
	else if(distance==3){
		this.x = x-3;
	}
	else if(distance==10){
		this.x = x-10;
	}
	}
public void setU(int y) {
	if(distance==5){
	this.y = y+5;
	}
	else if(distance==3){
		this.y = y+3;
	}
	else if(distance==10){
		this.y = y+10;
	}
	}
public void setD(int y){
	if(distance==5){
	this.y = y-5;
	}
	else if(distance==3){
		this.y = y-3;
	}
	else if(distance==10){
		this.y = y-10;
	}
	}

public int getDxu() {
	return dy;
	}
public int getDxd(){
	return dy;
}
public int getDxr(){
	return dx;
}
public int getDxl(){
	return dx;
}
public void setDxu(int y){
	this.y = y+dy;
}
public void setDxd(int y){
	this.y = y-dy;
}
public void setDxr(int x){
	this.x = x+dx;
}
public void setDxl(int x){
	this.x = x-dx;
}
}