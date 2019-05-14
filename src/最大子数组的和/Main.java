package 最大子数组的和;

/**
 * @author : qiuyeliang
 * create at:  2019/5/13  16:25
 * @description:
 */
public class Main {
    public static int maxSum(int[] arr){
        if(arr == null || arr.length == 0)
            return 0;
        int max = Integer.MIN_VALUE;
        int cur = 0;
        for(int i=0;i!=arr.length;i++){
            cur += arr[i];
            max = Math.max(max,cur);
            cur = cur < 0 ? 0:cur;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,-5,6,-2};
        System.out.println(maxSum(arr));
    }
}
