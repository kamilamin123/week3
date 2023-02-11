package main;

public class Methodref {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(Methodref::printMessage);
		t.start();

	}
	
	public static void printMessage( ) {
		System.out.println("hello");
	}
}
