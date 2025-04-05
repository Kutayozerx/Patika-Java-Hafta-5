package beyond_classes_enums.EnumÖdev;

public enum Day {

    MONDAY("09:00 - 17:00"),
    TUESDAY("09:00 - 17:00"),
    WEDNESDAY("09:00 - 17:00"),
    THURSDAY("09:00 - 17:00"),
    FRIDAY("09:00 - 17:00"),
    SATURDAY("kapalı"),
    SUNDAY("kapalı"),
    ;

    private final String workingHours;

    Day(String workingHours) {
        this.workingHours = workingHours;
    }

    public String getWorkingHours() {
        return workingHours;
    }
}
