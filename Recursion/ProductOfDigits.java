package Recursion;

public class ProductOfDigits {
    public static void main(String[] args) {

        System.out.println(pod(13420));
    }
    static int pod(int n)
    {
        if(n%10==n)
        {
            return n;
        }
        return n%10 * pod(n/10);
    }




}
