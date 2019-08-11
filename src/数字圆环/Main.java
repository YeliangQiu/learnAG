package 数字圆环;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : qiuyeliang
 * create at:  2019/8/3  16:01
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            int n = sc.nextInt();
            int flag = 1;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            Arrays.sort(arr);
            for (int i = 1; i < n-1; i++) {
                int sum = arr[i - 1] + arr[i + 1];
                if (arr[i] > sum) {
                    flag = 0;
                    break;
                }
            }
            if(arr[n-1] > arr[n-2] + arr[0])
                flag = 0;
            if (flag == 0)
                System.out.println("NO");
            else
                System.out.println("YES");
            t--;
        }
    }
}
