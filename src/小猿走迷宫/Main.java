package 小猿走迷宫;

import java.util.Scanner;

/**
 * @author : qiuyeliang
 * create at:  2019/8/3  19:23
 * @description:
 */
public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int M = sc.nextInt();
//        int K = sc.nextInt();
        int N = 3,M=3,K=1;
//        int[][] a = new int[N][M];
        int[][] a = {{1,3,3},{2,4,9},{8,9,2}};
//        for(int i=0;i<N;i++){
//            for(int j=0;j<M;j++){
//               a[i][j] = sc.nextInt();
//            }
//        }
       int flag = Integer.MIN_VALUE;
        System.out.println(DFS(K,N,M,0,0,flag,a));
    }

    private static int DFS(int threshold,int rows,int cols,int i,int j,int flag,int[][] a){
        if(i >= rows || j>=cols || i<0 || j<0) {
            return 0;
        }
        if(a[i][j] < flag){
            if(threshold > 0)
                threshold = threshold - 1;
            else return 0;
        }
        return 1+DFS(threshold,rows,cols,i+1,j,a[i][j],a) + DFS(threshold,rows,cols,i-1,j,a[i][j],a)
                + DFS(threshold,rows,cols,i,j+1,a[i][j],a) + DFS(threshold,rows,cols,i,j-1,a[i][j],a);
    }
}
