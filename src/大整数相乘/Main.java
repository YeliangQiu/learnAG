package 大整数相乘;

import java.util.Scanner;

/**
 * @author : qiuyeliang
 * create at:  2019/5/5  22:04
 * @description: 有两个用字符串表示的非常大的大整数, 算出他们的乘积，也是用字符串表示。不能用系统自带的大整数类型。 输入描述: 空格分隔的两个字符串，代表输入的两个大整数 输出描述: 输入的乘积，用字符串表示
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num1 = in.nextBigDecimal().toString();
        String num2 = in.nextBigDecimal().toString();
        int[] ans = new int[num1.length() + num2.length()];
        for(int i=num1.length()-1;i>=0;i--){ //最后一位向前
            int x = num1.charAt(i) - '0';
            for(int j=num2.length()-1;j>=0;j--){
                int y = num2.charAt(j) - '0';
                ans[i+j]+=(ans[i+j+1]+x*y)/10;
                ans[i+j+1]=(ans[i+j+1]+x*y)%10; //进位
            }
        }
        StringBuilder s = new StringBuilder("");
        for(int i=0;i<ans.length;i++){
            if(i==0&&ans[i]==0)
                continue;
            s.append(ans[i]);
        }
        System.out.println(s);
    }
}
