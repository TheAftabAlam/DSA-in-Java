package Recursion;

public class fibonacci {
    public static void main(String[] args) {
        //System.out.println(fab(5));
//        fab(5);
        int N=5;
        for(int i=0; i<N; i++)
        {
            System.out.print(fab(i)+" ");
        }


    }
    static  int fab(int n)
    {
        if (n < 2) return n;

        return fab(n - 1) + fab(n - 2);
    }




}
