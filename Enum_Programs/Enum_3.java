enum Color {
    RED, BLUE, GREEN, YELLOW
}
public class Enum_3 {
    
    public static void main(String[] args) {
        for (Color c : Color.values()) {
            System.out.println(c);
        }
    }
}