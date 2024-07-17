package w3r;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * https://www.w3resource.com/java-exercises/lambda/index.php
 * */
public class Exercise6 {
	public static void main(String[] args) {
		int[] intArr = { 34, 35, 12, 656, 78, 12, 67, 9789 };
//		List<Integer> intList = new ArrayList(Arrays.asList(intArr));
		// actually it is not boxed internally some problem
		List<Integer> intList = Arrays.stream(intArr).boxed().collect(Collectors.toList());

		String[] strArr = { "Syed", "Mizbah", "sAiF", "uDDiN" };
		List<String> strList = new ArrayList(Arrays.asList(strArr));

		double[] doubleArr = { 34.5, 3.5, 0.12, 6.56, 7.8, 1.2, 6.7, 97.89 };
//		List<Double> doubleList = new ArrayList(Arrays.asList(doubleArr));
		List<Double> doubleList = Arrays.stream(doubleArr).boxed().collect(Collectors.toList());

		intList.stream().distinct()
				.mapToInt(Integer::intValue)
				.average()
				.ifPresent(System.out::println);

		doubleList.stream()
				.mapToDouble(Double::doubleValue)
				.average()
				.ifPresent(System.out::println);

		Arrays.stream(doubleArr)
				.average()
				.ifPresent(System.out::println);

	}
}
