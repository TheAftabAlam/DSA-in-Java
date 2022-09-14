package Recursion;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    static  int fact(int m)
    {
        if(m==1)
        {
            return m;
        }
        return m*fact(m-1);
    }



}
