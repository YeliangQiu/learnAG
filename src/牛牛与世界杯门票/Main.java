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
        int n = sc.nextInt();//加上牛牛一共n+1个人
        int m = sc.nextInt();//m种套餐
        int k = sc.nextInt();//单张门票
        int[] x = new int[m];
        int[] y = new int[m];
        for(int i=0;i<m;i++){
            x[i] = sc.nextInt(); //价格
            y[i] = sc.nextInt(); //门票的数量
        }
        int[] dp = new int[n+2];
        for(int i=1;i<=n+1;i++) //n个人买买单张门票的价钱
            dp[i] = k * i;
        for(int i=1;i<=n+1;i++){//n+1个人
            for(int j=0;j<m;j++){ //m种套餐
                if(i-y[j]>=0) //这个套餐买完人数还不够
                    dp[i] = Math.min(dp[i],dp[i-y[j]]+x[j]); //买差额的钱+买套餐的钱，和不买套餐相比
                else
                    dp[i] = Math.min(dp[i],x[j]); //如果套餐能够覆盖到现在的人数，则与当前的价格比较
            }
        }
        System.out.println(dp[n+1]);
    }
}
