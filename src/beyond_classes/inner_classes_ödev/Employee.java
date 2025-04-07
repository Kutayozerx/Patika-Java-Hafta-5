package beyond_classes.inner_classes_ödev;

public class Employee {

    private String firstName;
    private String lastName;

    public class ContactInfo {
        private String phoneNumber;
        private String email;

        public ContactInfo(String phoneNumber, String email) {
            this.phoneNumber = phoneNumber;
            this.email = email;
        }


        public void displayContactInfo() {
            System.out.println("İletişim Bilgileri:");
            System.out.println("Telefon: " + phoneNumber);
            System.out.println("E-posta: " + email);
        }
    }

    private ContactInfo contactInfo;

    public Employee(String firstName, String lastName, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactInfo = new ContactInfo(phoneNumber, email);
    }

    public void displayEmployeeInfo() {
        System.out.println("Çalışan Bilgileri:");
        System.out.println("Ad: " + firstName);
        System.out.println("Soyad: " + lastName);
        contactInfo.displayContactInfo();
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Kutay", "Özer", "0551 111 111", "kutayozer04@gmail.com");
        employee.displayEmployeeInfo();
    }
}
