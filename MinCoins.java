package upgrad;

import java.util.Scanner;

public class MinCoins
{
    public static void main(String [] str)
    {
        Scanner sc= new Scanner(System.in);
        int k=sc.nextInt();
        int coins []= new int[k];
        for(int i=0;i<k;i++){
            coins[i]=sc.nextInt();
        }
        int n= sc.nextInt();
        dynamic(coins, n);
    }

    private static void dynamic(int[] coins, int n)
    {
        int v[][]= new int[n+1][coins.length+1];
        for(int j=0;j<= coins.length;j++){
            v[0][j]=0;
        }
        for(int i=0;i<=n;i++){
            v[i][0]=i;
        }

            for(int i=1;i<=n;i++){
                for(int j=1;j<= coins.length;j++){
                if(coins[j-1]<=i && v[i][j-1]>v[i-coins[j-1]][j]+1){
                    v[i][j]= v[i-coins[j-1]][j]+1;
                }
                else
                    v[i][j]= v[i][j-1];
            }
        }
        System.out.println(v[n][coins.length]);

        int i= n;
        int j= coins.length;
        while(i>0 && j>0){
            if(v[i][j]== v[i][j-1]){
                j=j-1;
            }
            else{
                System.out.println("Selected no:"+ coins[j-1]);
                i=i-coins[j-1];
            }
        }
        while(i>0){
            System.out.println("Selected no:"+ coins[0]);
            i--;
        }
    }


}
