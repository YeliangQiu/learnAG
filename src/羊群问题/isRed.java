package 羊群问题;

/**
 * @author : qiuyeliang
 * create at:  2019/6/30  20:26
 * @description:
 */
import java.util.Arrays;
import java.util.Scanner;

public class isRed {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);

        int l =1;
        int r=10000;

        while(l<r) {
            int mid = (l+r+1)/2;
            if(solve(mid,arr,N,C))
                l=mid;
            else r=mid-1;
        }
        System.out.println(l);
    }
    public static boolean solve(int mid,int[] a,int n,int c) {
        int pre=0,cnt=1;
        for(int i=1;i<n;i++)
            if(a[i]-a[pre]>=mid) {
                cnt++;
                pre=i;
            }
        return cnt>=c;
    }
}
