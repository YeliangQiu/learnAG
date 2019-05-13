package 图;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author : qiuyeliang
 * create at:  2019/5/7  11:10
 * @description: 构造图
 */
public class Graph {
    int verNum;
    int edgeNum;
    Vertex[] verArray;

    public Graph(){
        Scanner sc = new Scanner(System.in);
        verNum = sc.nextInt();
        edgeNum = sc.nextInt();
        verArray = new Vertex[verNum];

        System.out.println("依次输入结点号");
        for(int i=0;i<verNum;i++){
            Vertex vertex = new Vertex();
            vertex.verIndex =  sc.nextInt();
            vertex.edgeLink = null;
            verArray[i] = vertex;
        }

        System.out.println("输入边的情况");
        for(int i=0;i<edgeNum;i++){
            int preIndex = sc.nextInt(); //头节点
            int folIndex = sc.nextInt(); //尾节点
            int weight = sc.nextInt();

            Vertex preV = getVertex(preIndex);
            Vertex folV = getVertex(folIndex);
            if(preV == null || folV ==  null){ //如果没有这些结点
                System.out.println("输入错误");
                i--;
                continue;
            }

            Edge edge = new Edge();//构造新的边
            edge.tailName = folIndex; //尾部节点的名称
            edge.weight = weight; //边的权重
            //将边加入链表中去
            edge.broEdge = preV.edgeLink; //头插法插入
            preV.edgeLink = edge;

            //下面这段表示为有向图
            Edge edge1 = new Edge();
            edge1.tailName = preIndex; //尾部节点名称
            edge1.broEdge = folV.edgeLink;
            folV.edgeLink = edge1;
        }
    }

    public Vertex getVertex(int index){
        for(int i=0;i<verNum;i++){
            if(verArray[i].verIndex == index)
                return verArray[i];
        }
        return null;
    }

    public List<Integer> adj(int v){
        List<Integer> list = new ArrayList<>();
        Edge edge = verArray[v].edgeLink;
        while (edge != null) {
            list.add(edge.tailName);
            edge = edge.broEdge;
        }
        return list;
    }

    public String toString(){
        String str = "";
        for(int i=0;i<verNum;i++){
            System.out.print("结点" + i +"->");
            for(int node:adj(i))
                System.out.print(node + "->");
            System.out.println();
        }
        return str;
    }
}
