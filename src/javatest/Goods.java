package javatest;

public class Goods {
	String name;
	int price;
	int numberOfStock;
	int sold;
	
	public Goods(String name, int price, int numberOfStock, int sold) {
		this.name = name;
		this.price = price;
		this.numberOfStock = numberOfStock;
		this.sold = sold;
	}
	
	public void print() {
		System.out.println("��ǰ �̸� : " + name);
		System.out.println("��ǰ ���� : " + price);
		System.out.println("��� ���� : " + numberOfStock);
		System.out.println("�ȸ� ���� : " + sold);
	}
	
	public static void main(String[] args) {
		Goods camera = new Goods("Nikon", 400000, 30, 50);
		camera.print();
	}
}
