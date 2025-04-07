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

    // Çalışan bilgilerini ve iletişim bilgilerini gösteren metot
    public void displayEmployeeInfo() {
        System.out.println("Çalışan Bilgileri:");
        System.out.println("Ad: " + firstName);
        System.out.println("Soyad: " + lastName);
        contactInfo.displayContactInfo();
    }

    // Main metodu - örnek kullanım
    public static void main(String[] args) {
        Employee employee = new Employee("Ahmet", "Yılmaz", "0555 123 4567", "ahmet.yilmaz@example.com");
        employee.displayEmployeeInfo();
    }
}
