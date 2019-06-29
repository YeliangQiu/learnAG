package 背包01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author : qiuyeliang
 * create at:  2019/6/5  14:15
 * @description:
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int total= Integer.parseInt(br.readLine());
        int [] arrA= parseInts(br.readLine().split(" "));
        int [] arrB= parseInts(br.readLine().split(" "));
        solution(total,arrA,arrB);
    }

    private static int[] parseInts(String[] strArr){
        if (strArr==null || strArr.length==0){
            return new int [0];
        }
        int [] intArr=new int[strArr.length];
        for (int i=0;i<intArr.length;i++){
            intArr[i] =Integer.parseInt(strArr[i]);
        }
        return intArr;
    }

    public static void solution(int total, int[] arrA, int[] arrB) {
        int n = arrA.length; //物品数量
        int[] w = new int[n + 1];
        int[] v = new int[n + 1];
        int[][] G = new int[n + 1][total + 1];
        for (int i = 1; i < n + 1; i++) {
            w[i] = arrA[i - 1];
            v[i] = arrB[i - 1];
        }

        int[] values = new int[total + 1];
        for (int i = 1; i < n + 1; i++) {
            for (int t = total; t >= w[i]; t--) {
                if (values[t] < values[t - w[i]] + v[i]) {
                    values[t] = values[t - w[i]] + v[i];
                    G[i][t] = 1;
                }
            }
        }
        System.out.println(values[total]);
    }


}