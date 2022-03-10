package ch03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MethodRefer {
	public static void main(String[] args) {

		List<Apple> list = new ArrayList<>();
		Apple apple1 = new Apple(13);
		Apple apple2 = new Apple(132);
		Apple apple3 = new Apple(1232);
		Apple apple4 = new Apple(232);
		Apple apple5 = new Apple(432);

		list.add(apple1);
		list.add(apple2);
		list.add(apple3);
		list.add(apple4);
		list.add(apple5);
//		Comparator<T>

		list.sort((a1, a2) -> a1.getWeight().compareTo(a2.getWeight()));

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getWeight());
		}
//		System.out.println(list.toString());
	}

}
