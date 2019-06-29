package 彩色瓷砖;

import java.util.Scanner;

/**
 * @author : qiuyeliang
 * create at:  2019/6/19  19:21
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ch = str.toCharArray();
        int ans = 0;
        for(int i=1;i<ch.length;i++){
            if(ch[i] == ch[i-1]){
                ans ++;
                i++;
            }
        }
        System.out.println(ans);
    }
}