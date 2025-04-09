package lambdas_functional_interfaces.lambdas;

public class CheckİfHopper implements CheckTrait {


    @Override
    public boolean test(Animal animal) {
        return animal.canHop();
    }
}
