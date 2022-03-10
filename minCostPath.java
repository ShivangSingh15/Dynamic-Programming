package upgrad;

import java.util.Scanner;

public class minCostPath
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();
        int cost[][]= new int [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                cost[i][j]= sc.nextInt();
            }
        }
        // ENTER COORDINATES WE WANT TO GO
        int x= sc.nextInt();
        int y= sc.nextInt();
        int ans= minCost(cost, x, y);
        System.out.println(ans);
    }

    private static int minCost(int[][] cost, int x, int y)
    {
        int minCosts[][]= new int[x+1][y+1];
        minCosts[0][0]= cost[0][0];
        for(int i=1;i<=x;i++){
            minCosts[i][0]= minCosts[i-1][0] + cost[i][0];
        }
        for(int j=1;j<=y;j++){
            minCosts[0][j]= minCosts[0][j-1] + cost[0][j];
        }
        for(int i=1;i<=x;i++){
            for(int j=1;j<=y;j++){
                minCosts[i][j]= min(minCosts[i-1][j-1], minCosts[i][j-1], minCosts[i-1][j]) + cost[i][j];
            }
        }
        return minCosts[x][y];
    }

    private static int min(int i, int i1, int i2)
    {
        if(i<i1){
            return (i<i2)?i:12;
        }
        else
            return (i1<12)?i1:i2;
    }
}
