package Recursion;

public class ReverseNum {

    static int sum=0;

    public static void main(String[] args) {
        fun(12345);
        System.out.println(sum);
    }
    static  void fun(int n)
    {
        if(n<=0)
        {
            return ;
        }
//        System.out.print(n%10);
//        fun(n/10);

        int rem=n%10;
        sum=sum*10+rem;
        fun(n/10);



    }
}
