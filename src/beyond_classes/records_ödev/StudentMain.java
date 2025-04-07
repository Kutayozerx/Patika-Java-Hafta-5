package beyond_classes.records_ödev;

public class StudentMain {

    public static void  main(String[] args) {

        Student student1 = new Student("Kutay","Özer","605");
        Student student2 = new Student("Ahmet","Sarı","111");
        Student student3 = new Student("Ali","Kırmızı","222");


        System.out.println("Öğrenci 1: " + student1);
        System.out.println("Öğrenci 2: " + student2);
        System.out.println("Öğrenci 3: " + student3);


        System.out.println("student1 hashCode: " + student1.hashCode());
        System.out.println("student2 hashCode: " + student2.hashCode());
        System.out.println("student3 hashCode: " + student3.hashCode());





    }
}
