package 数三角形;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() + 1;
        int m = sc.nextInt() + 1;
        long ans = n*m*(n*m-1)*(n*m-2)/6-m*n*(n-1)*(n-2)/6-n*m*(m-1)*(m-2)/6;
        for(int i=2;i<=n-1;i++){
            for(int j=2;j<=m-1;j++)
                ans-=2*(n-i)*(m-j)*(gcd(i,j)-1);
        }
        System.out.println(ans);
    }

    public static long gcd(long x,long y){
        if(x%y==0)
            return y;
        else return gcd(y,x%y);
    }
}
