package ch03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

	public static List<Integer> filter(List<Integer> list, Predicate<Integer> p) {
		List<Integer> result = new ArrayList<>();
		for (Integer t : list) {
			if (p.test(t)) {
				result.add(t);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		List<Integer> list = filter(Arrays.asList(1, 2, 3, 4, 5, 6, 7), (Integer i) -> i > 3);

		System.out.println(list.toString());
	}
}
