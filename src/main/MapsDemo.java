package main;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MapsDemo {
	public static void main(String[] args) {
		Map<String, Date> m =new HashMap<>();
		m.put("kamil", new Date());
		System.out.println(m);
		
	}
}
