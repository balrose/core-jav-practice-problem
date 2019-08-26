package test_another;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Assignement {
	private static int counter;

	public static void main(String[] args) {

printStringElement() ;

		
	}

	public static String    printStringElement () {
		int i=0;
		counter = 0;
		String[] array1 =  new String [] {"Put","Get","set","math","physic"};
		
		List<String> list = Arrays.asList(array1);
		Collections.reverse(list);
		array1=(String[])list.toArray();
		
		for (; i<array1.length;i++) {
			counter++;
						
		
		System.out.println( array1[i]);
		
	
		
	}
		System.out.println("counter:" +counter);
		return array1[i-1];
		
		
	}
	
}
