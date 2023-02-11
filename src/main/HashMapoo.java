package main;

import java.util.HashMap;

public class HashMapoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		String b ="Hello";
		int[] c =new int[3];
		HashMap<String, String> x = new HashMap<String, String>();
		x.put("kamil", "654321");
		x.put("sami", "sami123");
		x.put("samil", "Samil@123");
		System.out.println(x);
		System.out.println(x.containsValue("sami123"));
		System.out.println(x.containsKey("sami"));
		x.remove("sami");
		System.out.println(x);
		System.out.println(x.containsValue("sami123"));
		System.out.println(x.containsKey("sami"));
		System.out.println(x.replace("samil", "SAMISAMI"));
		System.out.println(x);
		System.out.println(x.replace("samil", "SAMISAMI","Samil@123"));
		System.out.println(x);
		System.out.println(x.replace("samil", "SAMISAMI","Samil@123"));
		System.out.println(x);
		System.out.println(x.keySet());
		System.out.println(x.values());
		

	}

}
