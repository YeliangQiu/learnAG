package 应该吃哪个呢;

import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int[] v = new int[10000];
        int[] l = new int[10000];
        int[] c = new int[10000];
        for(int i=1;i<=N;i++){
            v[i] = sc.nextInt();
            l[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        System.out.println(solution(N,T,v,l,c));
    }

    public static int solution(int N,int T,int[] v,int[] l,int[] c){
        int k = N + 1;
        int[] f = new int[10000];
        for(int i=1;i<=N;i++){
            while (c[i] != 1){
                l[k] = l[i];
                v[k] = v[i];
                k++;
                c[i] --;
            }
        }
        for(int i=1;i<=k;i++){
            for(int j=T;j>=1;j--){
                if(v[i]<=j)
                    f[j] = Math.max(f[j],f[j-v[i]]+l[i]);
            }
        }
        return f[T];
    }
}
