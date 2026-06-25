public class CommandLine_Arg2 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please pass a number as argument");
            return;
        }

        int num = Integer.parseInt(args[0]);

        if (num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}

