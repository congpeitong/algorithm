package malehunter.dataStructure.Sort;


/**
 * @ClassName QuickSort
 * @Description 快速排序  轴  小的放左边，大的放右边
 * @Autor MaleHunter
 * @Date 2021-03-29 16:59
 * @Version 1.0
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arrs = {7,3,2,10,8,1,9,5,4,6};
        sort(arrs,0,arrs.length-1);
        print(arrs);

    }
    static void sort(int[] arrs, int leftBound, int rightBound){
        if (leftBound >= rightBound) return;
        int mid = partition(arrs,leftBound,rightBound);
        sort(arrs,leftBound,mid-1);
        sort(arrs,mid + 1, rightBound);


    }

    private static int partition(int[] arrs, int leftBound, int rightBound) {
        int pivot = arrs[rightBound];
        int left = leftBound;
        int right = rightBound - 1;
        while (left <= right) {
            while (left<=right && arrs[left] <= pivot) left++;
            while (left<=right && arrs[right] > pivot) right--;
            if(left < right) swap(arrs,left,right);
        }

        swap(arrs,left,rightBound);
        // 轴的位置
        return left;
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
