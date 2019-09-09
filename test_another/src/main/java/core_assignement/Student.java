package core_assignement;

import java.util.ArrayList;

public class Student {
	int Id;
	String name;

public static void main(String[] args) {
	
	ArrayList<String > list1 = new ArrayList <String>();//only using same data type 

	list1.add("Jhon");
	list1.add("Jhon1");
	list1.add("Jhon0");
	list1.add("Jhon52");
	list1.add("Jhon1");
	System.out.println( list1);
	
	// open for any Data entry 
	ArrayList list = new ArrayList();
	
	Student S1 = new Student();
	S1.Id = 10;
	S1.name ="Mary";
	
	list.add(12);
	list.add("Jhon");
	list.add(23);
	list.add(2.2);
	list.add(S1);
	System.out.println(list);
	
	//String name=list1.get(2);
	//System.out.println(name);
	 // updates the arrayList
	list1.set(2, "Jack");
	System.out.println(list1);
	
	// remove the element
	
	list.remove(2);
	System.out.println(list);
	
	list.set(2, "Alyssa");
	System.out.println(list);
	
	Student obj = new Student();
	obj.name="Mary";
	obj.Id =100;
	
	list.add(obj);
	
	
String name =  list1.get(4);
list1.set(4, "element");
	
	System.out.println(list1);
	//list1.clear();
	//System.out.println(list1);
	
	if(list.contains("Alyssa")) {
		System.out.println("Alyssa is in the list");
	}else {
			System.out.println("not available in the list");
	}
	System.out.println("Iterating with enhanced for loop");
	for(int i=0;i<list.size();i++) {
	System.out.println(list);
}
for(String str:list1) {
System.out.println(str);
}
	
	
	
	
	
	
}
}
