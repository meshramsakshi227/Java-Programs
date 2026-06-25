enum Mobile {
    SAMSUNG(15000),
    REALME(12000),
    REDMI(10000);

    int price;

    Mobile(int price) {
        this.price = price;
    }
}

public class Enum_6 {
    
    public static void main(String[] args) {
        for (Mobile m : Mobile.values()) {
            System.out.println(m + " : " + m.price);
        }
    }
}