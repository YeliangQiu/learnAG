package 独立的小易;

import java.util.Scanner;

/**
 * @author : qiuyeliang
 * create at:  2019/5/7  22:05
 * @description: 小易为了向他的父母表现他已经长大独立了, 他决定搬出去自己居住一段时间。一个人生活增加了许多花费: 小易每天必须吃一个水果并且需要每天支付x元的房屋租金。当前小易手中已经有f个水果和d元钱,小易也能去商店购买一些水果,商店每个水果售卖p元。小易为了表现他独立生活的能力,希望能独立生活的时间越长越好,小易希望你来帮他计算一下他最多能独立生活多少天。
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int f = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int ans = 0;
        while(true){
            if(f > 0){
                f--;
                if(d-x >= 0){
                    d = d-x;
                    ans ++;
                }else break;
            }else{
                ans = ans + d / (p+x);
                break;
            }
        }
        System.out.println(ans);
    }
}
