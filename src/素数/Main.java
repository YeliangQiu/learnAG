package 素数;

import java.util.Scanner;

/**
 * @author : qiuyeliang
 * create at:  2019/6/30  20:10
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        for(int i= 2;i < Math.sqrt(n);i++){
            if(answer[i] == 0){
                for(int j = i*i;j<n;j=j+i)
                    answer[j] = 1;
            }
        }
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<n;i++) {
            if (answer[i] == 0) {
                ans.append(i);
                ans.append(" ");
            }
        }
        ans.deleteCharAt(ans.length()-1);
        System.out.println(ans);
    }
}
