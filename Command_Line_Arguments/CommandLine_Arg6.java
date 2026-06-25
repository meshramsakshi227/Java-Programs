public class CommandLine_Arg6 {
    
        public static void main(String args[]) {
        String str = args[0];

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}