enum Month {
    JAN(1), FEB(2), MAR(3);

    int number;

    Month(int number) {
        this.number = number;
    }
}

public class Enum_4 {
    
    public static void main(String[] args) {
        System.out.println(Month.FEB.number);
    }
}