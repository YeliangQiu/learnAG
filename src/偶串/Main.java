package 偶串;

import java.util.Scanner;

/**
 * @author : qiuyeliang
 * create at:  2019/6/19  19:31
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ch = str.toCharArray();
        int ans = 0;
        boolean flag;
        for(int i=(ch.length-1)/2;i>=1;i--){
            flag = true;
            for(int j=0;j<i;j++){
                if(ch[j] != ch[i+j])
                    flag = false;
            }
            if(flag) {
                ans = i * 2;
                break;
            }
        }
        System.out.print(ans);
    }
}
