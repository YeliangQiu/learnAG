package MultiplicationOfLargeIntergers;

import java.util.Scanner;

/**
 * @author : qiuyeliang
 * create at:  2019/4/2  19:22
 * @description: 有两个用字符串表示的非常大的大整数, 算出他们的乘积，也是用字符串表示。不能用系统自带的大整数类型。
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        mulLargeInterge(str1,str2);
    }

    private static void mulLargeInterge(String str1,String str2){
        int[] ans = new int[str1.length() + str2.length()];
        StringBuilder res = new StringBuilder("");
        for(int i=str1.length()-1;i>=0;i--){
            int x = str1.charAt(i) - '0';
            for(int j=str2.length()-1;j>=0;j--){
                int y = str2.charAt(j) - '0';
                ans[i+j] += (x * y + ans[i+j+1]) / 10;
                ans[i+j+1] = (x * y + ans[i+j+1]) % 10;
            }
        }
        for(int i=0;i<ans.length;i++) {
            if (i == 0 && ans[i] == 0)
                continue;
            res.append(ans[i]);
        }
        System.out.println(res);
    }
}
