package Visitingfriends;

import java.util.Scanner;

/**
 * @author : qiuyeliang
 * create at:  2019/4/23  20:58
 * @description: 小易准备去拜访他的朋友，他的家在0点，但是他的朋友的家在x点(x > 0)，均在一条坐标轴上。小易每一次可以向前走1，2，3，4或者5步。问小易最少走多少次可以到达他的朋友的家。
 * 一行包含一个数字x(1 <= x <= 1000000)，代表朋友家的位置。
 * 一个整数，最少的步数。
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = 0;
        while(n != 0){
            if(n>=5){
                n=n-5;
                ans ++;
            }else if(n>=4){
                n=n-4;
                ans ++;
            }else if(n>=3){
                n=n-3;
                ans ++;
            }else if(n>=2){
                n=n-2;
                ans ++;
            }else if(n>=1){
                n=n-1;
                ans ++;
            }
        }
        System.out.println(ans);
    }
}

