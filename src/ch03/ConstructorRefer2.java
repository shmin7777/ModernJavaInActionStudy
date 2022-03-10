package ch03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

public class ConstructorRefer2 {
	public static void main(String[] args) {
		List<Integer> weight = Arrays.asList(6, 3, 2, 16);

		List<Apple> list = map(weight, Apple::new);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getWeight());
		}

	}

	public static List<Apple> map(List<Integer> list, IntFunction<Apple> f) {
		List<Apple> result = new ArrayList<Apple>();

		for (Integer i : list) {
			result.add(f.apply(i));
		}
		return result;
	}
}
