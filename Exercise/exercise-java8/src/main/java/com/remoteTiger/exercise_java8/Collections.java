package com.remoteTiger.exercise_java8;

import java.util.Arrays;
import java.util.List;

public class Collections {
	
public static void main(String[] args) {
	List<Person> people = Arrays.asList(
			new Person ("Habimana","Donat",60),
			new Person ("Habimana","KMek",66),
			new Person ("Mugabe","Jonath",60),
			new Person ("Ruvino","Kennet",60)
		
			
			);
		/*
		 * people.stream() .filter(p->p.getLastname().startsWith(""))
		 * .forEach(p->System.out.println(p.getLastname()));//TERNAMIL OPERATION WHICH
		 * CAUSING STREAM TO START
		 */
	 long count = people.parallelStream()
	.filter(p->p.getLastname().startsWith("K"))
	.count();
	System.out.println(count);
			
}
}
