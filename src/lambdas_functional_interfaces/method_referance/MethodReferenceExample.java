package lambdas_functional_interfaces.method_referance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class MethodReferenceExample {

    public static void main(String[] args) {
     // 1;static method referance -> ClassName::methodname
     // 2: Instance method referamce -> objectReferance::instanceMethod
     // 3: Instance method referance(Sınıf üzerinden) -> ClassName::methodName
     // 4: Constructor method referance -> Classname::new


      // 1;static method referance -> ClassName::methodname
        BiFunction<Integer, Integer, Integer > sum = MathOperations::sum;
        System.out.println("Toplam = " + sum.apply(5,9));


        // 2: Instance method referamce -> objectReferance::instanceMethod
        Printer printer = new Printer();
        Consumer<String> stringConsumer = printer::print;
        stringConsumer.accept("Merhaba method referance");


        // 3: Instance method referance(Sınıf üzerinden) -> ClassName::methodName
        List<String> names = Arrays.asList("Ahmet","Veli","Ayşe","Kutay");
        names.forEach(System.out::println);


        // 4: Constructor method referance -> Classname::new
        Supplier<Car> carSupplier = Car::new;
        carSupplier.get();




    }
}
