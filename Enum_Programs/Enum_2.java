enum Day {
    MONDAY, TUESDAY, WEDNESDAY
}

public class Enum_2 {
    public static void main(String[] args) {
        Day d = Day.TUESDAY;

        switch (d) {
            case MONDAY:
                System.out.println("Start of week");
                break;
            case TUESDAY:
                System.out.println("Second day");
                break;
            default:
                System.out.println("Other day");
        }
    }
}

