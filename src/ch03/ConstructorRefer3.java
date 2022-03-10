package ch03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;

interface TriFunction<T, Y, V, R> {
	R apply(T t, Y y, V v);
}

public class ConstructorRefer3 {

	public static void main(String[] args) {
		TriFunction<Integer, Integer, Integer, Person> tri = Person::new;
		Person person = tri.apply(30000, 85, 182);

		System.out.println(person.toString());
	}
}

class Person {
	int money;
	int weight;
	int height;

	public Person(int money, int weight, int height) {
		this.money = money;
		this.weight = weight;
		this.height = height;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "money :: " + money + "\nweight :: " + weight + "\nheight :: " + height;
	}
}
