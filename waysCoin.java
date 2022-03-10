package upgrad;

import java.util.Scanner;

public class waysCoin
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int k=sc.nextInt();
        int coins []= new int[k];
        for(int i=0;i<k;i++){
            coins[i]=sc.nextInt();
        }
        int n= sc.nextInt();
        int ans= ways(coins, n);
        System.out.println(ans);
    }

    private static int ways(int[] coins, int n)
    {
        int v[][]= new int[n+1][coins.length+1];
        for(int i=0;i<=n;i++){
            v[i][0]= 1;
        }
        for(int j=0;j<= coins.length;j++){
            v[0][j]= 1;
        }
        int x,y;
        for(int i=1;i<=n;i++){
            for(int j=1;j<= coins.length;j++){
                x = (i-coins[j-1] >= 0)? v[i - coins[j-1]][j]: 0;
                y = (j-1 >= 1)? v[i][j-1]: 0;
                v[i][j] = x + y;
            }
        }
        return v[n][coins.length];
    }
}
