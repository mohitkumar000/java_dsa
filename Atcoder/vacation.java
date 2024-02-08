/**
 * @author - Kirti Singh Duhan
 */

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][3];
        for(int i= 0;i<n;i++) {
            arr[i][0] = scn.nextInt();
            arr[i][1] =  scn.nextInt();
            arr[i][2] = scn.nextInt();
        }
        System.out.println(taroProfit(arr, n));
    }

    private static int frogJump(int[] h, int n1, int k) {
        int[] dp = new int[n1];
        for(int i=1;i<n1;i++) {
            int ans = (int)(1e9);
            for(int j = 1;j<=k;j++) {
                if (i-j>=0) {
                    ans = Math.min(dp[i-j] + Math.abs(h[i]-h[i-j]), ans);
                }
            }
            dp[i] = ans;
        }
        return dp[n1-1];
    }

    private static int taroProfit(int[][] arr, int n) {
        for(int i=0;i<n;i++) {
            if (i-1>=0) {
                arr[i][0] += Math.max(arr[i-1][1], arr[i-1][2]);
                arr[i][1] += Math.max(arr[i-1][0], arr[i-1][2]);
                arr[i][2] += Math.max(arr[i-1][0], arr[i-1][1]);
            }
            if (i==n-1){
                return Math.max(arr[i][0], Math.max(arr[i][1], arr[i][2]));
            }
        }
        return 0;
    }
}


