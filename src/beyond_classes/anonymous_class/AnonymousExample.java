package beyond_classes.anonymous_class;

public class AnonymousExample {

    public static void main(String[] args) {

        Greeting greeting = new Greeting() {

            @Override
            public void sayHello() {
                System.out.println("Merhaba, ben anonim bir classım! ");
            }
        };

        greeting.sayHello();

        Greeting greeting1 = new GreetingImpl();
        greeting1.sayHello();

    }
}
