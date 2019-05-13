package 归并排序;

/**
 * @author : qiuyeliang
 * create at:  2019/5/13  09:39
 * @description: 归并排序
 */
public class Main {

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        sort(arr);
        for(int num:arr)
            System.out.println(num);
    }
    public static void sort(int[] arr){
        int[] temp = new int[arr.length];
        sort(arr,0,arr.length-1,temp);
    }

    public static void sort(int[] arr,int left,int right,int[] temp){
        if(left < right){
            int mid = (left + right) / 2;
            sort(arr,left,mid,temp);
            sort(arr,mid+1,right,temp);
            merge(arr,left,mid,right,temp);
        }
    }

    public static void merge(int[] arr,int left,int mid,int right,int[] temp){
        int i = left; //左序列的开头
        int j = mid+1; //右序列开头
        int t = 0; //临时数组
        while (i<=mid && j<=right){
            if(arr[i] < arr[j])
                temp[t++] = arr[i++];
            else
                temp[t++] = arr[j++];
        }
        while(i<=mid)
            temp[t++] = arr[i++];
        while(j<=right)
            temp[t++] = arr[j++];
        t = 0;
        while(left <= right){ //要填到数组的对应位置
            arr[left++] = temp[t++];
        }
    }
}
