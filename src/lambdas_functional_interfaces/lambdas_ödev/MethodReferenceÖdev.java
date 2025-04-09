package lambdas_functional_interfaces.lambdas_ödev;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceÖdev {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ahmet", "Ayşe", "Mehmet", "Zeynep");

        names.forEach(System.out::println);

    }
}
