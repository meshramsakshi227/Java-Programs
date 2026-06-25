/*
1. Open Vs code
2. Open Terminal
3. Compile - javac FileName.java
4. Run - java FileName arg1 arg2
 */
public class CommandLine_Arg {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("First argument: " + args[0]);
        } else {
            System.out.println("No command-line arguments were provided.");
        }
    }
}

