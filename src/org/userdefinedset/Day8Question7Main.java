package org.userdefinedset;

import java.util.LinkedHashSet;
import java.util.Set;

public class Day8Question7Main extends Day8Question7 {
	public static void main(String[] args) {
		Day8Question7Main d1 = new Day8Question7Main();
		d1.setStudId(1453);
		d1.setName("arun");
		d1.setAddress("omr");
		d1.setPhone(7234567890l);
		d1.setDob("23-09-1987");
		d1.setDoj("12-08-2005");
		d1.setEmail("arun@gmail.com");
		d1.setGender('m');
				
		Day8Question7Main d2 = new Day8Question7Main();
		d2.setStudId(2452);
		d2.setName("varun");
		d2.setAddress("guindy");
		d2.setPhone(7234534890l);
		d2.setDob("17-05-1989");
		d2.setDoj("21-08-2015");
		d2.setEmail("arun@gmail.com");
		d2.setGender('m');
				
		Day8Question7Main d3 = new Day8Question7Main();
		d3.setStudId(3456);
		d3.setName("maran");
		d3.setAddress("tambaram");
		d3.setPhone(7234787890l);
		d3.setDob("29-09-1999");
		d3.setDoj("01-08-2009");
		d3.setEmail("arun@gmail.com");
		d3.setGender('m');
				
		Set<Day8Question7Main> s = new LinkedHashSet<>();
		s.add(d1);
		s.add(d2);
		s.add(d3);
		
		for (Day8Question7Main d : s) {
			
			System.out.println(d.getStudId());
			System.out.println(d.getName());
			System.out.println(d.getPhone());
			System.out.println(d.getAddress());
			System.out.println(d.getEmail());
			System.out.println(d.getDob());
			System.out.println(d.getDoj());
			System.out.println(d.getGender());
			System.out.println("\n");
		}
	}

}
