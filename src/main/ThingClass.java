package main;

public class   ThingClass<T,T2>  {
	private T thing;
	private T2 thing2;
	public T getThing() {
		return thing;
	}
	public void setThing(T thing) {
		this.thing = thing;
	}
	public T2 getThing2() {
		return thing2;
	}
	public void setThing2(T2 thing2) {
		this.thing2 = thing2;
	}
	@Override
	public String toString() {
		return "ThingClass [thing=" + thing + ", thing2=" + thing2 + "]";
	}
	public ThingClass(T thing, T2 thing2) {
		super();
		this.thing = thing;
		this.thing2 = thing2;
	}

	

	

	
	
	
	
	
	
	

}
