enum Month {
    JAN(1), FEB(2), MAR(3);

    private int number;

    Month(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}

public class Enum_4.1 {
    public static void main(String[] args) {
        System.out.println(Month.FEB.getNumber());
    }
}
