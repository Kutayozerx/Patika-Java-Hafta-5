package beyond_classes_enums.record;

import java.util.List;

public class RecordExamples {

    public static void main(String[] args) {
        Point point = new Point(3,4);
        System.out.println(point);

        Point point1 = new Point(3,3);
        System.out.println(point);

        System.out.println("Rectangle Record!");

        Rectangle rectangle = new Rectangle(8,4);
        System.out.println("Alan" + rectangle.area());

        System.out.println("Bird Record!");

        var mommy = new Bird(4,"Maviş");
        System.out.println(mommy.name() + " - " + mommy.numberEggs());

        var child = new Bird(0,"Sarı");
        // child.name() = "Lacivert" compile olmuyor...

        List.of(mommy.getClass().getDeclaredMethods()).forEach(System.out::println);

        var child2 = new Bird(0,"Kırmızı","Turuncu");
        
    }
}
