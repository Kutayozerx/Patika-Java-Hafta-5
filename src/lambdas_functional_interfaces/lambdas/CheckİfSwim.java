package lambdas_functional_interfaces.lambdas;

public class CheckİfSwim implements CheckTrait {


    @Override
    public boolean test(Animal animal) {
        return animal.canSwim();
    }
}
