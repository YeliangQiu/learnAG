package 图;

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

        System.out.println("依次输入结点名称");
        for(int i=0;i<verNum;i++){
            Vertex vertex = new Vertex();
            vertex.verName = sc.next();
            vertex.edgeLink = null;
            verArray[i] = vertex;
        }

        for(int i=0;i<edgeNum;i++){
            String preName = sc.next(); //头节点
            int weight = sc.nextInt();
            String folName = sc.next(); //尾节点

            Vertex preV = getVertex(preName);
            Vertex folV = getVertex(folName);
            if(preV == null || folV ==  null){
                System.out.println("输入错误");
                i--;
                continue;
            }

            Edge edge = new Edge();
            edge.tailName = folName; //尾部节点的名称
            edge.weight = weight; //边的权重
            edge.broEdge = preV.edgeLink; //头插法插入
            preV.edgeLink = edge;

            //下面这段表示为有向图
            edge.tailName = preName; //尾部节点名称
            edge.broEdge = folV.edgeLink;
            folV.edgeLink = edge;
        }
    }

    public Vertex getVertex(String verName){
        for(int i=0;i<verNum;i++){
            if(verArray[i].verName.equals(verName))
                return verArray[i];
        }
        return null;
    }
}
