package 图;

/**
 * @author : qiuyeliang
 * create at:  2019/5/7  16:32
 * @description:
 */
public class DepthFirstSearch {
    private boolean[] marked;
    private int count;

    public DepthFirstSearch(Graph G,int s){
        marked = new boolean[G.verArray.length];
        dfs(G,s);
    }

    private void dfs(Graph G,int v){
        System.out.println(v);
        marked[v] = true;
        count ++;
        for(int node:G.adj(v)) {
            if (!marked[node])
                dfs(G,node);
        }
    }

    public boolean marked(int w) { //这个点是否被遍历郭
        return marked[w];
    }

    public int count(){ //有多少是连通的
        return count;
    }
}
