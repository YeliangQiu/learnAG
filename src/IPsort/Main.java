package IPsort;

import java.util.*;

/**
 * @author : qiuyeliang
 * create at:  2019/4/8  10:35
 * @description: IP地址排序
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<String> set = new TreeSet<>();
        while(in.hasNext()){
            String ip = in.next();
            if(ip.equals("EOF"))
                break;
            ip = ip.replaceAll("(\\d+)","00$1");//+匹配至少一次，或者连续多次，上不封顶
            System.out.println("IP补0="+ip);
            ip = ip.replaceAll("0*(\\d{3})","$1"); //+前面的0不要，只要最后三位
            System.out.println("IP截取3位="+ip);
            set.add(ip);
        }
        for(String str:set)
            System.out.println(str.replaceAll("0*(\\d+)","$1"));//只要数字
    }
}
