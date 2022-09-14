package Recursion;

public class CouneZeros {

    static int count=0;
    public static void main(String[] args) {

        CZeros(10005487);
        System.out.println(count);
    }
    static void CZeros(int n)
    {
        if(n<=0)
        {
            return ;
        }

        int rem=n%10;
        if(rem==0)
        {
            count++;
        }
        CZeros(n/10);


    }




}
