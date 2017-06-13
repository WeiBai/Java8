import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

/**
 * Created by baiwe on 2017/6/13.
 */
public class StreamVsCollection {
    public static void main(String...args){
        List<String> names = Arrays.asList("Java8","Lambdas","In","Action");
        Stream<String> s = names.stream();
        s.forEach(System.out::println);
    }
}
