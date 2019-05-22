package 牛牛偶像养成记;

import java.awt.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author : qiuyeliang
 * create at:  2019/5/15  19:27
 * @description:
 */



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 1;
        Point[] show = new Point[n];
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt() + start;
            show[i] = new Point(start, end);
        }
        Arrays.sort(show, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return o1.y - o2.y;
            }
        });
        int time = show[0].y;
        for (int i = 1; i < n; i++) {
            if (show[i].x >= time) {
                ans++;
                time = show[i].y;
            }
        }
        System.out.println(ans);
    }
}

//    public static class Cmp implements Comparator<Point>{
//        @Override
//        public int compare(Point o1,Point o2){
//            if(o1.y > o2.y)
//                return 1;
//            else
//                return 0;
//        }
//    }

