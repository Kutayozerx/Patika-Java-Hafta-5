package lambdas_functional_interfaces.lambdas;

import java.util.ArrayList;
import java.util.List;

public class LambdasExample2 {

    public static void main(String[] args) {

        var animals = new ArrayList<Animal>();
        animals.add(new Animal("Fish",false,true));
        animals.add(new Animal("Kangroo",true,false));
        animals.add(new Animal("rabbit",true,false));
        animals.add(new Animal("turtle",false,true));

        // print(animals , new CheckİfHopper());
        // print(animals, new CheckİfSwim());

        print(animals, a-> a.canHop());
        print(animals, a-> a.canSwim());


    }

    private static void print(List<Animal> animalList, CheckTrait checker) {

        for (Animal animal : animalList) {
            if (checker.test(animal)) {
            System.out.println(animal + " ");

            }
        }

        System.out.println();
    }
}