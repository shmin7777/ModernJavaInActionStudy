package ch03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Active {
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

//		Comparator<Apple> c = Comparator.comparing((Apple a1) -> a1.getWeight());

//		list.sort((a1, a2) -> (((Integer) a1.getWeight()).compareTo((Integer) a2.getWeight())));

//		list.sort(comparing(Apple::getWeight));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getWeight());
		}
	}
}
