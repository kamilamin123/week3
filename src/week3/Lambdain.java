package week3;

public class Lambdain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLambda Lambda1 = () -> System.out.println("Hello World"); 
		Lambda1.foo();
		MyLambda2 Lambda2 = (a, b) -> a+b;
		System.out.println(Lambda2.add(5,6));
		StringLength Lambda3 =(s) -> s.length();
		System.out.println(Lambda3.getLength("kamil"));

	}

}
@FunctionalInterface
interface MyLambda {
	void foo();
}

@FunctionalInterface
interface MyLambda2 {
	int add(int a, int b);
}

@FunctionalInterface
interface StringLength {
	int getLength(String s);
}

@FunctionalInterface
interface MyLambda4 {
	int div(int a, int b);
}