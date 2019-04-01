package MaximumProduct;

import java.util.Scanner;

/**
 * @author : qiuyeliang
 * create at:  2019/4/1  19:46
 * @description: 给定一个无序数组，包含正数、负数和0，要求从中找出3个数的乘积，使得乘积最大，要求时间复杂度：O(n)，空间复杂度：O(1)
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextLong();
        slove(arr);
    }
    public static void slove(long[] arr){
        long maxOne = Long.MIN_VALUE,maxTwo = Long.MIN_VALUE,maxThree = Long.MIN_VALUE;
        long minOne = Long.MAX_VALUE,minTwo = Long.MAX_VALUE;
        for(long n:arr){
            if(maxOne < n){
                maxThree = maxTwo;
                maxTwo = maxOne;
                maxOne = n;
            }else if(maxTwo < n){
                maxThree = maxTwo;
                maxTwo = n;
            }else if(maxThree < n)
                maxThree = n;
            if(minOne > n){
                minTwo = minOne;
                minOne = n;
            }else if(minTwo > n)
                minTwo = n;
        }
            System.out.println(Math.max(maxOne*maxTwo*maxThree,maxOne*minOne*minTwo));
    }
}
