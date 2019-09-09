package test_another;

import java.util.Arrays;
import java.util.List;

public class TopicStringIO {
	public static void main(String[] args) {
		/*ArrayList<Integer> myArrayList = new ArrayList<>();
		myArrayList.add(5);
		myArrayList.add(15);
		myArrayList.add(52);
		myArrayList.add(56);
		myArrayList.add(125);
		myArrayList.add(52);
		for (Integer item :myArrayList) {
			System.out.println(item);*/
		
		
		/*List<Integer> myArrayList =  Arrays.asList(new Integer[] {5,10,1,1,});// affiency ways to do it 
		
		for (Integer item :myArrayList) {
			System.out.println(item);*/
		List<Integer> myArrayList =  Arrays.asList(new Integer[] {5,10,1,1,});
		Integer [] myArray =myArrayList.toArray(new Integer[myArrayList.size()]);
		for (Integer item :myArray) {
			System.out.println(item);
		}
		
		
	}
}

