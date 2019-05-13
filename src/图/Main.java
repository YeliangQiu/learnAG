package 图;

/**
 * @author : qiuyeliang
 * create at:  2019/5/7  19:43
 * @description: 测试
 */
public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.toString();
        DepthFirstSearch depthFirstSearch = new DepthFirstSearch(graph,0);
        System.out.println("DFS了"+depthFirstSearch.count()+"个点");
        BreadthFirstPaths breadthFirstPaths = new BreadthFirstPaths(graph,0);
    }
}
