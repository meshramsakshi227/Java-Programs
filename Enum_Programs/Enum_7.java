enum Menu {
    ADD, DELETE, UPDATE, EXIT
}


public class Enum_7 {
    
    public static void main(String[] args) {
        Menu choice = Menu.UPDATE;

        switch (choice) {
            case ADD:
                System.out.println("Add Record");
                break;
            case DELETE:
                System.out.println("Delete Record");
                break;
            case UPDATE:
                System.out.println("Update Record");
                break;
            case EXIT:
                System.out.println("Exit");
                break;
        }
    }
}