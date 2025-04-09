package lambdas_functional_interfaces.lambdas;

public class LambdasExample {

    public static void main(String[] args) {
        // java 8 öncesi

     Greeting greeting = new Greeting() {
         @Override
         public void method(String string) {
             System.out.println("Hello " + string);
         }
     }   ;

     greeting.method("Kutay");

     //java 8 sonrası

     Greeting greeting1 = (name) -> System.out.println("Hello " + name);
     Greeting greeting2 = name -> {
         System.out.println("Hello " + name);
         System.out.println("Ben bir lambda methodum");
     };
     //lambdas
     // (parametre) -> {methodGövdesi}
     // eğer tek parametre varsa
     // parametre -> method gövdesi =  Greeting greeting1 = name -> System.out.println("Hello " + name);




    }
}
