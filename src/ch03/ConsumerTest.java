package ch03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {

	public static void forEach(List<Integer> list, Consumer<Integer> c) {
		for (Integer i : list) {
			c.accept(i);
		}
	}

	public static void main(String[] args) {
		forEach(Arrays.asList(1, 4, 2, 6, 47, 222, 12, 3, 4, 1, 2), (Integer i) -> System.out.println(i));
	}
}
