public class Count7
{
public static void main(String[] args)
{
public static int count7(int n){
        if(n == 7)
            return 1;
        else if(n > 9){
            int a = count7(n%10);
            int b = count7(n/10);
            return a + b;
        }else
            return 0;
}
}
}
