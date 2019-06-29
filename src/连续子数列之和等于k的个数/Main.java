package 连续子数列之和等于k的个数;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : qiuyeliang
 * create at:  2019/6/26  18:21
 * @description: Input = [1,1,1], k=2
 *               Output = 2
 */

public class Main {
    public static int subarraySum(int[] nums, int k){
        int sum = 0, result = 0;
        Map<Integer, Integer> pre = new HashMap<>();
        pre.put(0,1);
        for(int num:nums){
            sum += num;
            if(pre.containsKey(sum - k)) //sum-k是否出现在数组中
                result += pre.get(sum - k); //如果出现过就相加
            pre.put(sum, pre.getOrDefault(sum, 0) + 1);//等于sum的有多少个
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1,1,1};
        System.out.println(subarraySum(a,2));
    }
}
