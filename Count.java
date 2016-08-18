public class StringIndexOf {
public static void main(String[] args) {
    

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a sentence please: \n");
    String string = scanner.nextLine();

    int atIndex = 0;
    int count = 0;

    while (atIndex != -1)
    {
        atIndex = string.indexOf("hello", atIndex);

        if(atIndex != -1)
        {
            count++;
            atIndex += 5;
        }
    }

    System.out.println(count);
}
}
