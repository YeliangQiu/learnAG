package cost;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : qiuyeliang
 * create at:  2019/4/23  20:43
 * @description: 你有3个需要完成的任务，完成这3个任务是需要付出代价的。 首先，你可以不花任何代价的完成一个任务；然后，在完成了第i个任务之后，你可以花费|Ai - Aj|的代价完成第j个任务。|x|代表x的绝对值。 计算出完成所有任务的最小代价。
 * 一行3个整数A1,A2,A3，每个数字之间用一个空格分隔。所有数字都是整数，并且在[1,100]范围内。
 * 一个整数，代表最小的代价
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] num = new int[3];
        for(int i=0;i<3;i++)
            num[i] = in.nextInt();
        Arrays.sort(num);
        int key = num[1];
        int ans = Math.abs(num[2]-key) + Math.abs(num[0]-key);
        System.out.println(ans);
    }
}
