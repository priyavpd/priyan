import java.awt.Toolkit;
import java.util.Scanner;

public class Duplicate {

 public static void main(String[] args) {  

    Scanner kb = new Scanner(System. in );
    System.out.println("Entre String");
    String string = kb.nextLine();


    int length = string.length();
    if(length < 2) {
        System.out.println(string);
        return;
    }

    System.out.print(string.charAt(0));
    for (int i = 1; i < length; i++) {
        if (string.charAt(i) != string.charAt(i - 1)) {
            System.out.print(string.charAt(i));
          } 
    }
}
}
