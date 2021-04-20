package malehunter.datastructure.Sort;

/**
 * @ClassName MergeSort
 * @Description 归并排序
 * @Autor MaleHunter
 * @Date 2021-03-29 11:26
 * @Version 1.0
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arrs = {5,3,6,8,1,7,9,4,2,12,23,232,123};
        //int[] arrs = {1,4,7,8,3,6,9};
        sort(arrs,0,arrs.length - 1);
        print(arrs);

    }
    public static void sort(int[] arr, int left, int right){
        if (left == right) return;
        // 分成两半
        int mid = left + (right - left)/2;
        // 左边排序
        sort(arr,left,mid);
        // 右边排序
        sort(arr,mid+1,right);
        merge(arr,left,mid + 1,right);

    }
    static void merge(int[] arr, int leftPtr, int rightPtr, int rightBound){
        int mid =  rightPtr - 1;
        int[] temp = new int[rightBound - leftPtr + 1];
        // 数组第一个位置
        int i = leftPtr ;
        // 后半截数组第一个位置
        int j = rightPtr;
        // 辅助数组的第一个位置
        int k = 0;
        while (i <= mid && j <= rightBound){
             if (arr[i] <= arr[j]){
                 temp[k] = arr[i];
                 i++;
                 k++;
             } else {
                 temp[k] = arr[j];
                 j++;
                 k++;
             }
        }
        while ( i<= mid){
            temp[k++] = arr[i++];
        }
        while (j<=rightBound){
            temp[k++] = arr[j++];
        }
        for (int m = 0; m<temp.length;m++) arr[leftPtr + m] = temp[m];
       // print(temp);
    }
    // 交换
    static void swap(int [] arr, int i, int j){
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }
    static void print(int[] arr){
        for (int ar : arr) {
            System.out.print(ar + " ");
        }
    }
}
