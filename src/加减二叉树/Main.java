package 加减二叉树;

import java.util.Scanner;

/**
 * @author : qiuyeliang
 * create at:  2019/5/30  19:26
 * @description: 现在有一棵无限大的满二叉树，根节点编号为1。编号为i的节点的左儿子编号为2*i，右儿子2*i+1(比如根节点1的左儿子为2，右儿子为3，2的左儿子为4，右儿子为 5。)。牛牛在这棵树上做一个游戏，他从妞妞那里得到了两个数n和k，妞妞希望他拿着数字0从根节点开始往下走，每次选择一条边移动，到达一个节点时选择加 上这个节点的编号或者减去这个节点的编号。在走到第k个节点时所得到的数字刚好等于n。 这样的路径当然有很多。为了增加难度，妞妞决定让牛牛告诉她经过的节点的编号和最小的路径。 妞妞很聪明，给出的问题都是一定存在答案的。 你能帮帮牛牛吗?
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
    }
}
