package 重复字符分类;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author : qiuyeliang
 * create at:  2019/7/27  19:52
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine().toLowerCase();
            ArrayList<String> res = classifyRepeatChars(s);
            for (String ss : res)
                System.out.println(ss);
        }
    }

    public static ArrayList<String> classifyRepeatChars(String s) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        char[] array = s.toCharArray();
        int[] num = new int[26];
        for (int i = 0; i < array.length; i++) {
            num[array[i] - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (num[i] == 1) {
                sb1.append((char) ('a' + i));
            } else if (num[i] > 1) {
                sb2.append((char) ('a' + i));
            }
        }
        ArrayList<String> list = new ArrayList<>();
        list.add(sb2.toString());
        list.add(sb1.toString());
        return list;
    }
}

