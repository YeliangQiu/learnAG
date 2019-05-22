package 牛牛数星星;

import java.util.Scanner;

/**
 * @author : qiuyeliang
 * create at:  2019/5/15  20:41
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] res = new int[1001][1001];
        while(sc.hasNext()){
            int n = sc.nextInt();
            for(int i=0;i<n;i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                res[a][b] = 1;
            }
        }
        int len = res.length;
        for(int i=1;i<len;i++){
            for(int j=1;j<len;j++){
                res[i][j] = res[i][j] + res[i-1][j] + res[i][j-1] - res[i-1][j-1]; //每个点代表自己的区域内有多少星星
            }
        }
        int m = sc.nextInt();
        for(int i=0;i<m;i++){
            int a1 = sc.nextInt();
            int b1 = sc.nextInt();
            int a2 = sc.nextInt();
            int b2 = sc.nextInt();
            System.out.println(res[a2][b2]-res[a1-1][b1]-res[a2][b2-1]+res[a1-1][b1]-1); //各个区域做加减
        }
    }
}
