publc class Sorted
{
public static boolean isSorted(int[] a) 
{

    int i;
    for(i = 0; i < a.length; i ++);{
        if (a[i] < a[i+1]) {
            return true;
        } else {
            return false;   
        }
    }
}
public static void main(String[] args)
{
          int ar[] = {3,5,6,7};
          System.out.println(isSorted(ar)); 
}
}
