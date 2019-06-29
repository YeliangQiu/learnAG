package 疯狂队列;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : qiuyeliang
 * create at:  2019/5/30  19:35
 * @description: 小易老师是非常严厉的, 它会要求所有学生在进入教室前都排成一列, 并且他要求学生按照身高不递减的顺序排列。有一次,n个学生在列队的时候,小易老师正好去卫生间了。学生们终于有机会反击了,于是学生们决定来一次疯狂的队列,他们定义一个队列的疯狂值为每对相邻排列学生身高差的绝对值总和。由于按照身高顺序排列的队列的疯狂值是最小的,他们当然决定按照疯狂值最大的顺序来进行列队。现在给出n个学生的身高,请计算出这些学生列队的最大可能的疯狂值。小易老师回来一定会气得半死。
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for(int i=0;i<n;i++)
            h[i] = sc.nextInt();
        Arrays.sort(h);
        int min = h[0];
        int max = h[n-1];
        int curMaxIndex = n-2;
        int curMinIndex = 1;
        int ans = max - min;
        while(curMinIndex < curMaxIndex){
            ans += max - h[curMinIndex];
            ans += h[curMaxIndex] - min;
            max = h[curMaxIndex--];
            min = h[curMinIndex++];
        }
        ans += Math.max(max - h[curMinIndex],h[curMaxIndex]-min);
        System.out.println(ans);
    }
}
