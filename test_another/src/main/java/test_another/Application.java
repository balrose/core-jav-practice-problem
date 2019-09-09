package test_another;

public class Application<brown> {

	public static void main(String[] args) {

		String S1 = "Test";
		String S2 = "Test";
		String S3 = new String("Test ");// * BECAUSE THIS NEED WIT NEW KEYWORD WILL NOT BE THE SAME
		System.out.println(S1 == S2);
		System.out.println(S1.equals(S2));
		System.out.println(S2 == S3);
		System.out.println(S2.equals(S3));// is used to compare the object

		// Object s1 = new Object();

		int[] array1 = new int[] { 1, 2, 3, 4 };
		int[] array2 = new int[2];

		array2[0] = 5;
		array2[1] = 50;
		// array2[2] = 50; // this exception come because we are trying to access the
		// index which we has not created like here we have 3 element and the size is 2
		// so we got
		// java.lang.ArrayIndexOutOfBoundsException: 2 which is run check exception
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
			// System.out.println(array1[i]);

		}

		for (int item : array1) { // it can be used with any array ;array list hash set and so on
			System.out.println(item);
		}

		int i = 97;
		double d = 97.0;
		System.out.println(i == d);

		char c = 'a';// the answer will be true because == will compre only the value and a is equal
						// to 97 value
		System.out.println(c == i);

	}
	
	
}