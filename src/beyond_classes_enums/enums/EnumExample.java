package beyond_classes_enums.enums;

public class EnumExample {

    public static void main(String[] args) {

        for (Day day : Day.values()){
            System.out.println(day);
        }

        System.out.println(Direction.NORTH.name() + "-" + Direction.NORTH.ordinal() + "-" + Direction.NORTH.getAngle());
        System.out.println(Direction.EAST.name() + "-" + Direction.EAST.ordinal() + "-" + Direction.EAST.getAngle());
        System.out.println(Direction.SOUTH.name() + "-" + Direction.SOUTH.ordinal() + "-" + Direction.SOUTH.getAngle());
        System.out.println(Direction.WEST.name() + "-" + Direction.WEST.ordinal() + "-" + Direction.WEST.getAngle());


        System.out.println("Operation");

        System.out.println(Operation.ADD.apply(5,7));

        System.out.println(Operation.SUBTRACT.apply(8,2));
    }
}
