package Combination_Sum3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : qiuyeliang
 * create at:  2019/6/30  00:32
 * @description:
 * Input: k=3,n=7
 * Output: [[1,2,4]]
 * Input: k=3,n=9
 * OutPut:[[1,2,6],[1,3,5],[2,3,4]]
 */
public class Main {
    public static List<List<Integer>> combinationSum3(int[] candidates, int target,int k){
        List<List<Integer>> res = new ArrayList<>();
        dfs(res,new ArrayList<Integer>(),candidates,target,k,0);
        return res;
    }

    private static void dfs(List<List<Integer>> res, ArrayList<Integer> list, int[] candiddates,int target,int k,int start){
        if(target < 0) //负了就丢
            return;
        if(list.size()>3)
            return;
        if(target == 0 && list.size() == 3){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=start;i<candiddates.length;i++){
            list.add(candiddates[i]);//尝试加入
            dfs(res,list,candiddates,target-candiddates[i],k,i+1);
            list.remove(list.size()-1); //删除
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        List<List<Integer>> list = combinationSum3(a,9,3);
        for(List<Integer> res:list){
            for(int i:res)
                System.out.print(i);
            System.out.println();
        }
    }
}
