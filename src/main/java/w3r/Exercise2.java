package w3r;

import java.util.Arrays;
import java.util.List;

/*
 * https://www.w3resource.com/java-exercises/lambda/java-lambda-exercise-3.php
 * */
public class Exercise2 {
	public static void main(String[] args) {
		Case upper = (s) -> s.toUpperCase();
		List<String> arr = Arrays.asList(new String[] { "ok", "hmm" });
		List<String> arr2 = Arrays.asList("ok", "hmm");

		for (String s : arr) {
			System.out.println(upper.convert(s));
		}

		arr.replaceAll((s) -> s.toUpperCase()); // unary operation - replaces
//		arr.removeIf(null); // predicate
//		arr.forEach(null); // consumer - does not replace

		for (String s : arr) {
			System.out.println(s);
		}

	}
}

interface Case {
	String convert(String s);
}
