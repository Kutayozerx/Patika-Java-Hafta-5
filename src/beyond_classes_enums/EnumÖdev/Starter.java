package beyond_classes_enums.EnumÖdev;

import java.util.Scanner;

public class Starter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir gün girin: ");
        String input = scanner.nextLine();

        Day selectedDay = getDayFromInput(input);

        if (selectedDay != null) {
            System.out.println(selectedDay + " günü çalışma saatleri: " + selectedDay.getWorkingHours());
        } else {
            System.out.println("Geçersiz gün girdiniz. Lütfen geçerli bir gün adı girin. ");
        }

        scanner.close();
    }

    private static Day getDayFromInput(String input) {
        for (Day day : Day.values()) {
            if (day.name().equalsIgnoreCase(input)) {
                return day;
            }
        }
        return null;
    }
}
