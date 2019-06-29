package 牛牛与世界杯门票;

import java.util.Scanner;

/**
 * @author : qiuyeliang
 * create at:  2019/5/16  09:36
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] x = new int[m];
        int[] y = new int[m];
        for(int i=0;i<m;i++){
            x[i] = sc.nextInt(); //价格
            y[i] = sc.nextInt(); //门票的数量
        }
        int[] dp = new int[n+2];
        for(int i=1;i<=n+1;i++)
            dp[i] = k * i;
        for(int i=1;i<=n+1;i++){
            for(int j=0;j<m;j++){
                if(i-y[j]>=0)
                    dp[i] = Math.min(dp[i],dp[i-y[j]]+x[j]);
                else
                    dp[i] = Math.min(dp[i],x[j]);
            }
        }
        System.out.println(dp[n+1]);
    }
}
