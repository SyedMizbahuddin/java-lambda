package w3r;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * https://www.w3resource.com/java-exercises/lambda/java-lambda-exercise-5.php
 * */
public class Exercise5 {
	public static void main(String[] args) {
		int[] intArr = { 34, 35, 12, 656, 78, 12, 67, 9789 };
		List<Integer> intList = new ArrayList(Arrays.asList(intArr));

		String[] strArr = { "Syed", "Mizbah", "sAiF", "uDDiN" };
		List<String> strList = new ArrayList(Arrays.asList(strArr));

		System.out.println(strList.stream().sorted(String::compareToIgnoreCase).toList());
		System.out.println(strList.stream().sorted().toList());

	}
}
