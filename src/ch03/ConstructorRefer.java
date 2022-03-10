package ch03;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;

public class ConstructorRefer {
	static Supplier<Apple> s1 = Apple::new;

	static IntFunction<Apple> f1 = Apple::new;

	public static void main(String[] args) {
		Apple a1 = s1.get();
		Apple a2 = f1.apply(110);
		System.out.println(a2.getWeight());
	}
}
