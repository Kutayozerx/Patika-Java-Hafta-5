package lambdas_functional_interfaces.lambdas_ödev;

import java.util.Arrays;
import java.util.List;

public class Lambdas {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.replaceAll(x -> x * 2);

        numbers.forEach(x -> System.out.println(x));


    }
}
