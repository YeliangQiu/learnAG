package 牛牛与妞妞;

import java.util.Scanner;

/**
 * @author : qiuyeliang
 * create at:  2019/5/16  10:06
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] visited = new int[14];
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int c2 = sc.nextInt();
        visited[a1]++;
        visited[b1]++;
        visited[c1]++;
        visited[a2]++;
        visited[b2]++;
        visited[c2]++;
        int sum1 = a1 + b1 + c1;
        int sum2 = a2 + b2 + c2;
        int cnt = 0;
        for(int i=1;i<=13;i++){
            if(visited[i] == 4)
                continue;
            visited[i] += 1;
            sum2 += i;
            for(int j=1;j<=13;j++){
                if(sum2 < sum1 + j) {
                    cnt += (4 - visited[j]) * (5 - visited[i]);
                }
            }
            visited[i] -= 1;
            sum2 -= i;
        }
        //System.out.println(cnt);
        System.out.println(String.format("%.4f",cnt*1.0/2070));
    }
}
