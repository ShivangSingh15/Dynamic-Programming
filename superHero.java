package upgrad;

import java.util.Scanner;

public class superHero
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(minJump(n));
    }

    private static int minJump(int n)
    {
        int f[]= new int[n+1];
        f[1]= 0;
        for(int i=2;i<=n;i++){
            if(i%2==0 && i%3==0){
                f[i]= 1+ Math.min(Math.min(f[i/2], f[i/3]), f[i-1]);
            }
            if(i%2==0){
                f[i]= 1+ Math.min(f[i/2], f[i-1]);
            }
            else if(i%3==0){
                f[i]= 1+ Math.min(f[i/3], f[i-1]);
            }
            else
                f[i]= f[i-1];
        }
        return f[n];
    }

//        for (i = 2; i <= n; i++)
//    {
//        x = f[i-1];
//        if(i%2==0){
//            x = min(f[i/2], x);
//        }
//        if(i%3==0){
//            x = min(x, f[i/3]);
//        }
//        f[i]=x + 1;
//    }
//        return f[n];


}
