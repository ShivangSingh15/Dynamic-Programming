package upgrad;

import java.util.Scanner;

public class fibonacci_dynamic
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacci_dynamic ob= new fibonacci_dynamic();
        //ob.spaceOptimised(n);
        ob.using1D(n);
    }
    // CAN PRINT SERIES UPTO N
    public void using1D(int n)
    {
        int f[] = new int[n+1];
        f[0] = 0;
        f[1] = 1;
        System.out.println("0");
        System.out.println("1");
        for (int i = 2; i <n; i++)
        {
            f[i] = f[i - 1] + f[i - 2];
            System.out.println(f[i]);
        }

    }
    // PRINT ONLY Nth FIBONACCI NO.
    public void spaceOptimised(int n)
    {
        int a=0;
        int b=1;
        int c=1;
        for(int i=2;i<n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        System.out.print(c);
    }


}
