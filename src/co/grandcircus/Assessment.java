package co.grandcircus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

// @author Orestis Sinis / Assessment 2 / July 30, 2019

public class Assessment {

	public static void main(String[] args) {

		// ----------------The below lines test method addValues.

		System.out.println(Arrays.toString(addValues("red", "white", "blue")));

		// ----------------The below lines test method sumArray

		int[] testArr1 = { 5, 3, 8 };
		System.out.println(sumArray(testArr1));

		// ----------------The below lines test method removeWord

		String a = "dog";

		ArrayList<String> methodAlTest = new ArrayList<String>();
		methodAlTest.add("dog");
		methodAlTest.add("cat");
		methodAlTest.add("t-rex");
		System.out.println(removeWord(methodAlTest, a));

		// ----------------The below lines test method addToList
		String u = "falafel";
		System.out.println(addToList(u));

		// ----------------The below lines test method tryMe

		System.out.println(tryMe(18, 3)); // These values will provide a result which indicates method tryMe is working.
		System.out.println(tryMe(32, 0)); // These values will provide a result of 0 indicating it was not working.

	}
	// ----------------Methods begin below.

	public static String[] addValues(String a, String b, String c) {

		String[] colors = { a, b, c };
		return colors;
	}

	public static int sumArray(int[] arr1) {

		int arrSum = 0;
		for (int i = 0; i < arr1.length; i++) {
			arrSum = arrSum + arr1[i];
		}
		return arrSum;
	}

	public static ArrayList<String> removeWord(ArrayList<String> listString, String testStr) {

		if (listString.contains(testStr)) {
			listString.remove(testStr);
			return listString;
		} else {
			return listString;
		}
	}

	public static LinkedList<String> addToList(String strTest) {

		LinkedList<String> strListTest = new LinkedList<String>();

		String str1 = "grapes";
		String str2 = "oranges";

		strListTest.add(str1);
		strListTest.add(str2);
		strListTest.add(strTest);
		return strListTest;
	}

	public static int tryMe(int d, int e) {
		int quotient;
		try {
			quotient = d / e;
			return quotient;
		} catch (ArithmeticException e1) {
			System.out.println("Please ensure your values are valid!");
			return 0;
		}

	}

}
