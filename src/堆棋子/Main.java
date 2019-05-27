package 堆棋子;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author : qiuyeliang
 * create at:  2019/5/27  20:49
 * @description: 小易将n个棋子摆放在一张无限大的棋盘上。第i个棋子放在第x[i]行y[i]列。同一个格子允许放置多个棋子。每一次操作小易可以把一个棋子拿起并将其移动到原格子的上、下、左、右的任意一个格子中。小易想知道要让棋盘上出现有一个格子中至少有i(1 ≤ i ≤ n)个棋子所需要的最少操作次数.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for(int i=0;i<n;i++)
            x[i] = sc.nextInt();
        for(int i=0;i<n;i++)
            y[i] = sc.nextInt();
        int[] ans = minDis(x,y,n);
        StringBuilder result = new StringBuilder();
        for(int i=0;i<n;i++)
            result.append(String.valueOf(ans[i])+" ");
        System.out.println(result.toString());
    }

    public static int[] minDis(int[] x,int[] y,int n){
        PriorityQueue<Integer> queue = new PriorityQueue<>(); //优先队列可以自动从小到大排序
        int[] ans = new int[n];
        for(int i=0;i<n;i++)
            ans[i] = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){ //k就代表了所有点，前两层循环代表的就是笛卡尔积,聚合点一定在x[]和y[]的集合中，枚举曼哈顿举例
                    queue.add(Math.abs(x[k]-x[i]) + Math.abs(y[k]-y[j]));
                }
                int sum = 0;
                int tmp = 0;
                while(!queue.isEmpty()){
                    sum += queue.poll();
                    ans[tmp] = Math.min(sum,ans[tmp]);
                    tmp++;
                }
            }
        }
        return ans;
    }
}
