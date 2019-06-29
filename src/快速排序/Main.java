package 快速排序;

/**
 * @author : qiuyeliang
 * create at:  2019/6/5  13:48
 * @description:
 */
public class Main {

    public static void main(String[] args) {
        int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
        quickSort(arr,0,arr.length-1);
        for(int i:arr)
            System.out.println(i);

    }

    public static void quickSort(int[] arr,int low,int high){
        int l = low;
        int h = high;
        int povit = arr[low];
        while(l<h){
            while(l<h && arr[h]>=povit)
                h--;
            if(l<h)
                arr[l++] = arr[h];
            while(l<h && arr[l]<=povit)
                l++;
            if(l<h)
                arr[h--] = arr[l];
        }
        arr[l] = povit;
        if(l-1>low)
            quickSort(arr,low,l-1);
        if(h+1<high)
            quickSort(arr,h+1,high);
    }
}
