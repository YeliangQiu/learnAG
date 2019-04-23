package Swap;

/**
 * @author : qiuyeliang
 * create at:  2019/4/17  20:28
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        Integer a = 1, b = 2;

        //交换函数
        swap(a, b);

        System.out.println("result a= " + a + ",b=" + b);
    }

    private static void swap(Integer i1, Integer i2) {
        Integer tmp = i1;
        i1 = i2;
        i2 = tmp;
    }
}
