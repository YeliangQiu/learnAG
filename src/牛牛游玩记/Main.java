package 牛牛游玩记;

import java.awt.*;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author : qiuyeliang
 * create at:  2019/5/21  23:19
 * @description:  BFS搜索，从终点开始搜索，第一个碰到的起点就是答案
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        char arr[][] = new char[n][n];
        char[] a;
        int endX=0,endY=0;
        for(int i=0;i<n;i++){
            String str = sc.nextLine();
            a = str.toCharArray();
            for(int j=0;j<n;j++){
                arr[i][j] = a[j];
                if(a[j] == '*'){
                    endX = i;
                    endY = j;
                }
            }
        }
        System.out.println(BFS(arr,endX,endY,n)-1);
    }

    public static int BFS(char[][] arr,int endX,int endY,int n){
        int[][] deep = new int[n][n];
        Queue<Point> queue = new ArrayDeque<>();
        queue.offer(new Point(endX,endY));
        int[] tx = {-1,1,0,0};
        int[] ty = {0,0,1,-1};
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                deep[i][j] = -1;
        deep[endX][endY] = 1;
        while(queue.size() > 0){
            Point point = queue.poll();
            int i = point.x;
            int j = point.y;
            if(arr[i][j] == '@')
                return deep[i][j];
            for(int k=0;k<4;k++){
                int x = point.x + tx[k];
                int y = point.y + ty[k];
                if(x>=0 && x<n && y>=0 && y<n && arr[x][y]!= '#' && deep[x][y] == -1 ){
                    deep[x][y] = deep[point.x][point.y] + 1;
                    queue.offer(new Point(x,y));
                }
            }
        }
        return 0;
    }
}
