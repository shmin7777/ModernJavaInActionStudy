package ch03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;

public class LamdaVariable {

	static int r1 = 3;

	public static void main(String[] args) {
		int portNumber = 133;
		Runnable r = () -> System.out.println(r1);
//		r1 = 5;
		r.run();

		System.out.println("-----------");
		test();
	}

	public static void test() {
		int s = 3;
		Callable<Integer> r = () -> s + 3;
		try {
			System.out.println(r.call());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
