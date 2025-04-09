package lambdas_functional_interfaces.lambdas_ödev;

import java.util.Arrays;
import java.util.List;

public class Lambdas {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);


        numbers.stream()
                .map(n -> n * 2)
                .forEach(System.out::println);


    }
}
