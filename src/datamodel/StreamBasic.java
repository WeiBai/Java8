package datamodel;
import java.util.*;
import java.util.stream.*;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import static datamodel.Dish.menu;

/**
 * Created by baiwe on 2017/6/13.
 */
public class StreamBasic {

    public static void main(String...args){
        getLowCaloricDishesNamesInJava8(Dish.menu).forEach(System.out::println);
    }

    public static List<String> getLowCaloricDishesNamesInJava8(List<Dish> dishes){
        return dishes.stream()
                .filter(d -> d.getCalories() < 400)
                .sorted(comparing(Dish::getCalories))
                .limit(1)
                .map(Dish::getName)
                .collect(toList());
    }
}
