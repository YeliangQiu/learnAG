package 等差数列;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : qiuyeliang
 * create at:  2019/5/6  22:32
 * @description: 如果一个数列S满足对于所有的合法的i, 都有S[i + 1] = S[i] + d, 这里的d也可以是负数和零,我们就称数列S为等差数列。 小易现在有一个长度为n的数列x,小易想把x变为一个等差数列。小易允许在数列上做交换任意两个位置的数值的操作,并且交换操作允许交换多次。但是有些数列通过交换还是不能变成等差数列,小易需要判别一个数列是否能通过交换操作变成等差数列
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n <= 2) {
            System.out.println("Possible");
            return;
        }
        int[] x = new int[n];
        for(int i=0;i<n;i++)
            x[i] = sc.nextInt();
        Arrays.sort(x);
        int d = x[1] - x[0];
        for(int i=2;i<n;i++){
            if(x[i]-x[i-1] != d) {
                System.out.println("Impossible");
                return;
            }
        }
        System.out.println("Possible");
    }
}
