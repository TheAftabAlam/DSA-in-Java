package Recursion;

public class Palindrome {

    static int sum=0;
    public static void main(String[] args) {
        int n=123210;
       reverse(n);
        //System.out.println(sum);
       if(sum==n)
       {
           System.out.println("Yes");
       }
       else
       {
           System.out.println("No");
       }


    }

    static void reverse(int n)
    {
        if(n<=0)
        {
            return ;
        }
        sum=sum*10+n%10;

         reverse(n/10);

    }



}
