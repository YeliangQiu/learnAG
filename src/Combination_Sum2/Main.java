package Combination_Sum2;

import java.util.*;

/**
 * @author : qiuyeliang
 * create at:  2019/6/30  00:07
 * @description:
 *  IntPut:[10,1,2,7,6,1,5],target = 8,
 *  Output:[[1,7],[1,2,5],[2,6],[1,1,6]]
 */
public class Main {
    public static Set<List<Integer>> combinationSum2(int[] candidates, int target){
        Set<List<Integer>> res = new HashSet<>();
        dfs(res,new ArrayList<Integer>(),candidates,target,0);
        return res;
    }
    public static void dfs(Set<List<Integer>> res, ArrayList<Integer> list,int[] candiddates,int target,int start){
        if(target < 0)
            return;
        if(target == 0){
            Collections.sort(list);
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=start;i<candiddates.length;i++){
            list.add(candiddates[i]);
            dfs(res,list,candiddates,target-candiddates[i],i+1);
            list.remove(list.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] a = {10,1,2,7,6,1,5};
        Set<List<Integer>> ans = combinationSum2(a,8);
        for(List<Integer> list:ans){
            for(int i:list)
                System.out.print(i);
            System.out.println();
        }
    }
}
