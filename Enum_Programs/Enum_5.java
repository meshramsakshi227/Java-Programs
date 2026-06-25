enum Operation {
    ADD, SUBTRACT;

    public int display(int a, int b) {
        if(this == ADD)
            return a + b;
        else
            return a - b;
    }
}
public class Enum_5 {
    
    public static void main(String[] args) {
        System.out.println("Addition = " +
                Operation.ADD.display(10, 5));

        System.out.println("Subtraction = " +
                Operation.SUBTRACT.display(17, 10));
    }
}