package niuke;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int resa = 0,resb=0;
        while(in.hasNext()) {
            String str = in.next();
            if(str.equals("EOF"))
                break;
            char ch = str.charAt(0);
            if(ch == 'a')
               resa += Integer.parseInt(str.substring(str.indexOf("=")+1));
            if(ch == 'b')
                resb += Integer.parseInt(str.substring(str.indexOf("=")+1));
        }
        System.out.println("a: "+resa);
        System.out.println("b: "+resb);
    }
}
