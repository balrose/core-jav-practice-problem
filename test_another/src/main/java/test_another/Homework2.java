package test_another;
public class Homework2 {
public static void main(String[] args) {
	

	
	String s1 =  new  String  ("The quick brown fox jumps ");
    String s2 =  new String  ("The brown jumps");
    System.out.println(s1.substring(s2.length()));  //it will just do subtraction words fox jumps 
    System.out.println(s1.concat(s2)); // this will combine it and will not rewriting  common word.
}
}

// home work is to get  words which is not contains S1  wich is :Quick and Fox 