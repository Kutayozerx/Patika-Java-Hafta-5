package beyond_classes.nested_classes;

public class Outer2 {

    private static String message = "message";

     class Inner{

        void innerDisplay() {
            System.out.println("inner class");
        }
    }

    public  void outer2Display() {
        Outer2 outer = new Outer2();
        Outer2.Inner inner = outer.new Inner();

        inner.innerDisplay();

        System.out.println("Outer2 class");
    }
}
