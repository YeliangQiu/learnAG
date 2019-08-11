package 特殊的测试;

/**
 * @author : qiuyeliang
 * create at:  2019/8/10  19:49
 * @description:
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNextInt()){
            int k=sc.nextInt();
            int[] array=new int[k];
            for (int i = 0; i <k ; i++) {
                array[i]=sc.nextInt();
            }
            int result=getMaxAdd(array);
            System.out.println(result);
        }
    }

    private static int getMaxAdd(int[] array) {
        int addMin=0;
        int n=array.length;
        int start=0,end=n-1;
        while (start<end){
            while (start<end && array[start]<array[start+1]){
                start++;
            }
            while (start<end && array[end-1]>array[end]){
                end--;
            }
            if(start<end){
                if(array[start]<=array[end]){
                    addMin+=array[start]+1-array[start+1];
                    array[start+1]=array[start]+1;
                    start++;
                }else {
                    addMin+=array[end]+1-array[end-1];
                    array[end-1]=array[end]+1;
                    end--;
                }

            }
        }
        return addMin;
    }
}