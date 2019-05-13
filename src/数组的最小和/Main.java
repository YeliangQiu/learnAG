package 数组的最小和;

/**
 * @author : qiuyeliang
 * create at:  2019/5/12  21:57
 * @description: s=[1,3,5,2,4,6], s[0]左边小于或等于s[0]的数的和为0，s[2]左边小于或等于s[2]的数的和为1+3=4，以此类推s的小和数为0+1+4+1+6+15=27
 */
public class Main {
        public static void main(String[] args) {
            int[] arr = {1,3,5,2,4,6};
            System.out.println(sort(arr));
            for(int num:arr)
                System.out.println(num);
        }
        public static int sort(int[] arr){
            int[] temp = new int[arr.length];
            return sort(arr,0,arr.length-1,temp);
        }

        public static int sort(int[] arr,int left,int right,int[] temp){
            int ans = 0;
            if(left < right){
                int mid = (left + right) / 2;
                ans += sort(arr,left,mid,temp);
                ans += sort(arr,mid+1,right,temp);
                ans += merge(arr,left,mid,right,temp);
            }
            return ans;
        }

        public static int merge(int[] arr,int left,int mid,int right,int[] temp){
            int i = left; //左序列的开头
            int j = mid+1; //右序列开头
            int t = 0; //临时数组
            int smallNum = 0;
            while (i<=mid && j<=right){
                if(arr[i] < arr[j]) {//如果左边比右边小
                    smallNum += arr[i] * (right - j + 1);
                    temp[t++] = arr[i++];
                }
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
            return smallNum;
        }
}
