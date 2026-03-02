import java.util.*;
public class PalindromeCheckerApp {
    /*
    Application entry Point

    This is the first method executed by the JVM
    when the program starts
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text : ");
@@ -16,16 +12,22 @@ public static void main(String[] args) {
            if(input.charAt(i)!= input.charAt(j)){
                status = false;
            }
        }
            StringBuilder sb = new StringBuilder();
            for(int i = input.length() - 1; i >= 0 ; i--){
                sb.append(input.charAt(i));
            }
            String reverse = sb.toString();

            if(input.equals(reverse)){
                System.out.println("Is Palindrome ? true "  );
            }else{
                System.out.println("Is Palindrome ? false "  );
            }

    @author Developer
    @version 1.0
     */
        System.out.println("Is palindrome ? " + status);

    public static  void main(String []args){
        System.out.println("Welcome to the Palindrom Checker");
        System.out.println("Version 1.0");
        System.out.println("System initialised succesfully");

        System.out.println("Is palindrome ? " + status);

    }
}
}