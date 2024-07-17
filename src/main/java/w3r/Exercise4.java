package w3r;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * https://www.w3resource.com/java-exercises/lambda/java-lambda-exercise-4.php
 * */
public class Exercise4 {
	public static void main(String[] args) {

		List<Integer> num = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6));

		System.out.println(num.stream().filter(x -> x % 2 == 0).collect(Collectors.toList()));

		// The ArrayList returned by Arrays.asList is unModifiable as it not acutal
		// arrayList
		// but from Arrays.ArrayList private static class

//		num.removeIf((a) -> a % 2 == 0);
//		
//		num.stream();
//		
//		String[] a, b;
//		Arrays.equals(a, b, String::compareToIgnoreCase);
//		
//		

		int[] a = new int[] { 10, 20, 40, 50, 29, 40 };
		System.out.println(Arrays.stream(a).sum());
		System.out.println(Arrays.stream(a).max().getAsInt());
		System.out.println(Arrays.stream(a).average().getAsDouble());

		Stream
				.iterate(1, x -> x < 8, x -> x + 1)
				.filter(x -> x % 2 == 0)
				.limit(5)
				.forEach(System.out::println);

		Stream.of(1, 2, 3, 4, 4)
				.filter(x -> x % 2 == 0)
				.limit(5)
				.forEach(System.out::println);

		String[] arr = { "abc", "aijn", "biho", "okj" };

		Arrays.stream(arr)
				.filter(p -> p.startsWith("a"))
				.sorted()
				.forEach(System.out::println);

		Student[] students = { new Student(10, "ok"), new Student(100, "jmm"), new Student(100, "okj") };

		List<Student> studentList = new ArrayList<>(Arrays.asList(students));

		System.out.println(Arrays.stream(students).mapToInt(x -> x.getMarks()).average().getAsDouble());

		System.out.println(studentList.stream().mapToInt(x -> x.getMarks()).average().getAsDouble());

		System.out.println(
				studentList.stream().collect(Collectors.toMap(x -> x.getName(), Student::getMarks)));

		System.out.println(
				studentList.stream().collect(Collectors.groupingBy(x -> x.getMarks())));
	}

	static class Student {
		int marks;
		String name;

		Student(int marks, String name) {
			this.marks = marks;
			this.name = name;
		}

		int getMarks() {
			return marks;
		}

		String getName() {
			return name;
		}

		/**
		 *
		 */
		@Override
		public String toString() {
			return "Student [marks=" + marks + ", name=" + name + "]";
		}

	}
}
