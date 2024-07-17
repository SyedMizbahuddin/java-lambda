package w3r;

/*
 * https://www.w3resource.com/java-exercises/lambda/java-lambda-exercise-1.php
 * */
public class Exercise1 {
	public static void main(String[] args) {
		Sum s = (a, b) -> (a + b);
		System.out.println(s.sum(2, 3));
	}
}

interface Sum {
	int sum(int a, int b);
}
