package 移出栈底;

import java.util.Stack;

/**
 * @author : qiuyeliang
 * create at:  2019/5/12  21:25
 * @description: 用递归移出栈底元素
 */
public class Main {

    public static void reverse(Stack<Integer> stack){
        if(stack.isEmpty())
            return;
        int i = getAndRemoveLastElement(stack);
        reverse(stack);
        stack.push(i);
    }
    public static int getAndRemoveLastElement(Stack<Integer> stack){
        int result = stack.pop();
        if(stack.isEmpty())
            return result;
        else{
            int last = getAndRemoveLastElement(stack); //到底以后，取出来
            stack.push(result);
            return last;//把最后一个数一直往上传
        }
    }


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(getAndRemoveLastElement(stack));
    }
}
