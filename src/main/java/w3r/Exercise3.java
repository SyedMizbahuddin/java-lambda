package w3r;

import java.util.function.Predicate;

/*
 * https://www.w3resource.com/java-exercises/lambda/java-lambda-exercise-2.php
 * */
public class Exercise3 {
	public static void main(String[] args) {
		Str str = (s) -> s == null || s == "";

		System.out.println(str.empty("ok"));
		System.out.println(str.empty(""));

		Predicate<String> pre = (s) -> s.isEmpty();

		System.out.println(pre.test("ok"));
		System.out.println(pre.test(""));
	}
}

interface Str {
	boolean empty(String s);
}
