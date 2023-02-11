package main;


public class lambdai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		
		Printable lambdaPrintable = ()-> System.out.println("Meow");
		printThing(lambdaPrintable);
		
		
	}
	 static void printThing(Printable thing) {
		// TODO Auto-generated method; stub
		 thing.print();
	}

}
