package 机器人大战;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author : qiuyeliang
 * create at:  2019/8/4  20:24
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();
        int[][] dis = new int[n + 1][n + 1];
        for (int i = 0; i < m ; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                int w = sc.nextInt();
                if (dis[u][v] == 0 || dis[u][v] > w)
                    dis[u][v] = w;
        }
        int sum = 0;
        for(int i=0;i<c;i++) {
            int t = sc.nextInt();//终点
            sum += SPFA(dis, n, 0, t);
        }
        System.out.println(sum);
    }

    private static int SPFA(int[][] dis,int n,int s,int t){
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(s);
        int[] ans = new int[n+1];
        while(!queue.isEmpty()){
            int node = queue.poll();
            for(int i=1;i<=n;i++){
                if(i == s)
                    continue;
                if(dis[node][i] !=0 && (dis[node][i] + ans[node] < ans[i] || ans[i] ==0 )) {
                    ans[i] = dis[node][i] + ans[node];
                    queue.add(i);
                }
            }
        }
        return ans[t];
    }
}
