package 操作序列;

import java.util.Scanner;

/**
 * @author : qiuyeliang
 * create at:  2019/5/7  21:53
 * @description: 小易有一个长度为n的整数序列, a_1, ..., a_n。然后考虑在一个空序列b上进行n次以下操作: 1、将a_i放入b序列的末尾 2、逆置b序列 小易需要你计算输出操作n次之后的b序列。
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int[] ans =new int[n];
        if(n%2 != 0){
            int index = 0;
            for(int i=n-1;i>=0;i=i-2)
                ans[index++] = arr[i];
            for(int i=1;i<=n-1;i=i+2)
                ans[index++] = arr[i];
        }else{
            int index = 0;
            for(int i=n-1;i>=0;i=i-2)
                ans[index++] = arr[i];
            for(int i=0;i<=n-1;i=i+2)
                ans[index++] = arr[i];
        }
        for(int i=0;i<n-1;i++)
            System.out.print(ans[i] + " ");
        System.out.println(ans[n-1]);
    }
}
