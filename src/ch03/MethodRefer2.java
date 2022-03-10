package ch03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodRefer2 {
	public static void main(String[] args) {
		List<String> str = Arrays.asList("a", "b", "ab", "B");
		str.sort(String::compareToIgnoreCase);
		
		for (int i = 0; i <str.size(); i++) {
			System.out.println(str.get(i));
		}
	}

}
