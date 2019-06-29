package 阿里面试;

/**
 * @author : qiuyeliang
 * create at:  2019/6/5  13:10
 * @description:
 */
public class Main {

    /**
     *  输入: 4->5->6->7->8->NULL
     输出: 8->7->6->5->4->NULL
     */
    public static void main(String[] args) {
        // write your code here
        int[] arr = {4,5,6,7,8};
        Node head = create(arr);
        print(reverseList(head));
//        System.out.println("Hello World!");
    }
    public static Node create(int[] arr){
        Node head = new Node(-1);
        Node ans = head;
        for(int i=0;i<arr.length;i++){
            Node node = new Node(arr[i]);
            head.next = node;
            head = head.next;
        }
        head.next = null;
        return ans.next;
    }

    public static Node reverseList(Node head){
        Node node = new Node(-1);
        node.next = null;
        while(head != null){
            Node tmp = head;
            head = head.next;
            tmp.next = node.next;
            node.next = tmp;
        }
        return node.next;
    }

    public static void print(Node node){
        if(node == null) {
            System.out.print("NULL");
            return;
        }
        while(node.next != null){
            System.out.print(node.val + "->");
            node = node.next;
        }
        System.out.print(node.val + "->NULL");
    }
}

