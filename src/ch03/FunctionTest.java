package ch03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;

public class FunctionTest {

	public static List<String> map(List<Integer> list, Function<Integer, String> f) {
		List<String> l = new ArrayList<>();
		for (Integer i : list) {
			l.add(f.apply(i));
		}
		return l;
	}

	public static void main(String[] args) {
		List<String> list = map(Arrays.asList(1, 2, 3, 4, 2, 1, 4, 21, 23, 1, 254, 2), (Integer i) -> {
			return i.toString() + "123";
		});

		System.out.println(list.toString());
	}

}
