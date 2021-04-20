package malehunter.datastructure.Sort;
import java.util.Arrays;
/**
 * @ClassName CountSort
 * @Description 计数排序 数据作为索引 适用于特定问题
 * @Autor MaleHunter
 * @Date 2021-04-09 11:21
 * @Version 1.0
 */
public class CountSort {
   public static void main(String[] args) {
        int[] arr = {2,4,2,3,7,1,1,0,0,5,6,9,8,5,7,4,0,9};
        int[] result = sort(arr);
        System.out.println(Arrays.toString(result));
    }
    static int[] sort(int[] arr) {
        int[] result = new int[arr.length];
        int[] count = new int[10];
        for (int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        System.out.println(Arrays.toString(count));
//        for ( int i=0, j=0; i<count.length; i++){
//            while (count[i]-- > 0) result[j++] = i;
//        }
        for (int i = 1; i < count.length; i++) {
            count[i] = count[i] + count[i-1];
        }
        System.out.println(Arrays.toString(count));
        for (int i = arr.length-1; i >= 0; i--) {
            result[--count[arr[i]]] = arr[i];
        }
        return result;
    }
    static void findMax(int[] a, int n) {
        for (int j=0; j<n; j++){
            if (a[j] > a[j+1]) {
                swap(a,j,j+1);
            }
        }
    }
    // 交换
    static void swap(int [] arrs, int i, int j){
        if (arrs[i] != arrs[j]) {
            arrs[i] = arrs[i] + arrs[j];
            arrs[j] = arrs[i] - arrs[j];
            arrs[i] = arrs[i] - arrs[j];
        }
    }
    static void print(int[] arrs){
        for (int arr : arrs) {
            System.out.print(arr + " ");
        }
    }
}
