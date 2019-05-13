package 图;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author : qiuyeliang
 * create at:  2019/5/7  22:31
 * @description:
 */
public class BreadthFirstPaths {
    private boolean[] marked; //到达该定点的最短路径已知吗？
    private int[] edgeTo; //到达该定点的已知路径上的最后一个顶点
    private final int s; //起点

    public BreadthFirstPaths(Graph G,int s){
        marked = new boolean[G.verArray.length];
        edgeTo = new int[G.verArray.length];
        this.s = s;
        bfs(G,s);
    }

    private void bfs(Graph G,int s){
        Queue<Integer> queue = new ArrayDeque<>();
        marked[s] = true;
        queue.offer(s);
        while(!queue.isEmpty()){
            int v = queue.poll();
            System.out.println(v);
            for(int node:G.adj(v)){
                if(!marked[node]){ //从对于每个未被标记的相邻结点
                    edgeTo[node] = v;
                    marked[node] = true;
                    queue.offer(node);
                }
            }
        }
    }
}
