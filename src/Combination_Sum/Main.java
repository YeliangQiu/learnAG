package Combination_Sum;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : qiuyeliang
 * create at:  2019/6/29  23:42
 * @description:
 *
 * Input: candidates = [2,3,6,7], target = 7
 * Out Put:[[7],[2,2,3]]
 *
 * 回溯法
 */
public class Main {
    public static List<List<Integer>> combinationSum(int[] candidates, int target){
        List<List<Integer>> res = new ArrayList<>();
        dfs(res,new ArrayList<Integer>(),candidates,target,0);
        return res;
    }

    private static void dfs(List<List<Integer>> res, ArrayList<Integer> list, int[] candiddates,int target,int start){
        if(target < 0) //负了就丢
            return;
        if(target == 0){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=start;i<candiddates.length;i++){
            list.add(candiddates[i]);//尝试加入
            dfs(res,list,candiddates,target-candiddates[i],i);
            list.remove(list.size()-1); //删除
        }
    }

    public static void main(String[] args) {
        int[] a = {2,3,5};
        List<List<Integer>> list = combinationSum(a,8);
        for(List<Integer> res:list){
            for(int i:res)
                System.out.print(i);
            System.out.println();
        }
    }
}
