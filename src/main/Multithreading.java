package main;

public class Multithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for (int i=0; i<=6 ; i++) {
			Multithreadingthing mything= new Multithreadingthing(i);
			mything.start();
		}
		System.out.println(Thread.activeCount());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		

	}

}
