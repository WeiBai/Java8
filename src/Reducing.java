import java.util.stream.*;
import java.util.*;

import static datamodel.Dish.menu;
import datamodel.*;

/**
 * Created by baiwe on 2017/6/14.
 */
public class Reducing {
    public static void main(String...args){
        List<Integer> numbers = Arrays.asList(3,4,5,1,2);
        int sum = numbers.stream().reduce(0,(a, b) -> a + b);
        System.out.println(sum);

        int sum2 = numbers.stream().reduce(0,Integer::sum);
        System.out.println("The value of sum2: " + sum2);

        int max = numbers.stream().reduce(0,(a, b) -> Integer.max(a, b));
        System.out.println("The value of max: " + max);

        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        min.ifPresent(System.out::println);

        int calories = menu.stream()
                            .map(Dish::getCalories)
                            .reduce(0, Integer::sum);
        System.out.println("Sum of calories: " + calories);
    }
}
