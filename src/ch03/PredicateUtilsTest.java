package ch03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class PredicateUtilsTest {
	public static void main(String[] args) {
		Predicate<Apple> redApple = (Apple a1) -> a1.getWeight() > 300;

		// !
		Predicate<Apple> notRedApple = redApple.negate();

		// and
		Predicate<Apple> redAndGreenApple = redApple.and(apple -> apple.getColor().equals("green"));

		// or
		//

		List<Apple> list = new ArrayList<>();
		Apple apple1 = new Apple(13, "red");
		Apple apple2 = new Apple(132, "yellow");
		Apple apple3 = new Apple(1232, "green");
		Apple apple4 = new Apple(232, "green");
		Apple apple5 = new Apple(432, "red");

		list.add(apple1);
		list.add(apple2);
		list.add(apple3);
		list.add(apple4);
		list.add(apple5);

		List<Apple> result = getApple(list, redAndGreenApple);

		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i).getWeight());
		}
	}

	public static List<Apple> getApple(List<Apple> list, Predicate<Apple> p) {
		List<Apple> result = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (p.test(list.get(i))) {
				result.add(list.get(i));
			}
		}
		return result;
	}
}
