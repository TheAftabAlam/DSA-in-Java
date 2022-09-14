package Recursion;

public class SumOfDigits {


    public static void main(String[] args) {
        System.out.println(sod(1342));
    }
    static int sod(int num)
    {
        if(num<=0)
        {
            return 0;
        }
        return num%10 +  sod(num/10);
    }



}
