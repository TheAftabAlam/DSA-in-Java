package Recursion;

public class StepsToReduceZero {

    static int step=0;

    public static void main(String[] args) {
        steps(14);
        System.out.println(step);
    }
    static void steps(int n)
    {
        if(n<=0)
        {
            return;
        } else if (n%2==0) {
           n= n/2;
            step++;


        }

           steps(n-1);
           step++;

    }



}
