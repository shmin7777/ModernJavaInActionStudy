package ch04;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Menu.getMenu().stream().filter(d -> d.getColories() > 300).map(Dish::getName).limit(3)
                .collect(Collectors.toList());

//        list.stream().forEach(System.out::println);

        List<String> names = Menu.getMenu().stream().filter(d -> {
            System.out.println("filtering :: " + d.getName());
            return d.getColories() > 300;
        }).map(d -> {
            System.out.println("mapping :: " + d.getName());
            return d.getName();
        }).limit(3).collect(Collectors.toList());

//        System.out.println(names);

        long count = Menu.getMenu().stream().filter(d -> d.getColories() > 300).distinct().limit(3).count();
        System.out.println(count);

    }
}
