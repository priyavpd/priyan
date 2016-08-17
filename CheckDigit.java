# priyan
public class CheckDigit {

private static Scanner input;

public static void main(String[] args) {

    System.out.print("Enter a String:");
    input = new Scanner(System.in);
    String str = input.nextLine();

    if (CheckString(str)) {
        System.out.println(str + " is numeric");
    } else {
        System.out.println(str +" is not numeric");
    }
}

public static boolean CheckString(String str) {
    for (char c : str.toCharArray()) {
        if (!Character.isDigit(c))
            return false;
    }
    return true;
}
}
