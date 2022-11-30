package org.userdefinedmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Day9Question7Main extends Day9Question7{
	public static void main(String[] args) {
		Day9Question7Main d1 = new Day9Question7Main();
		d1.setStudId(1453);
		d1.setName("arun");
		d1.setAddress("omr");
		d1.setPhone(7234567890l);
		d1.setDob("23-09-1987");
		d1.setDoj("12-08-2005");
		d1.setEmail("arun@gmail.com");
		d1.setGender('M');
				
		Day9Question7Main d2 = new Day9Question7Main();
		d2.setStudId(2452);
		d2.setName("Gowri");
		d2.setAddress("guindy");
		d2.setPhone(7234534890l);
		d2.setDob("17-05-1989");
		d2.setDoj("21-08-2015");
		d2.setEmail("arun@gmail.com");
		d2.setGender('F');
				
		Day9Question7Main d3 = new Day9Question7Main();
		d3.setStudId(3456);
		d3.setName("maran");
		d3.setAddress("tambaram");
		d3.setPhone(7234787890l);
		d3.setDob("29-09-1999");
		d3.setDoj("01-08-2009");
		d3.setEmail("arun@gmail.com");
		d3.setGender('M');
				
		Map<Integer,Day9Question7Main > m = new LinkedHashMap<Integer, Day9Question7Main>();
		m.put(1, d1);
		m.put(2, d2);
		m.put(3, d3);
		Set<Entry<Integer, Day9Question7Main>> s = m.entrySet();
		
		for (Entry<Integer, Day9Question7Main> d : s) {
			System.out.println(d.getKey());
			System.out.println(d.getValue().getStudId());
			System.out.println(d.getValue().getName());
			System.out.println(d.getValue().getPhone());
			System.out.println(d.getValue().getAddress());
			System.out.println(d.getValue().getEmail());
			System.out.println(d.getValue().getDob());
			System.out.println(d.getValue().getDoj());
			System.out.println(d.getValue().getGender());
			System.out.println("\n");
		}
	}

}
