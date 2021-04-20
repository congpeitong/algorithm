package malehunter.datastructure.Sort;

/**
 * @ClassName BubbleSort
 * @Description 冒泡法排序
 * @Autor MaleHunter
 * @Date 2021-03-26 15:02
 * @Version 1.0
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arrs = {5,3,6,8,1,7,9,4,2,12,23,232,123};
        sort(arrs);
        print(arrs);

    }
    static void sort(int[] arrs){
        for (int i = 0; i<arrs.length - 1; i++){
            for (int j = 0; j<arrs.length - 1 - i; j++){
                if (arrs[j] > arrs[j+1]){
                    swap(arrs,j,j+1);
                }
            }
        }

    }
    // 交换
    static void swap(int [] arrs, int i, int j){
        arrs[i] = arrs[i] + arrs[j];
        arrs[j] = arrs[i] - arrs[j];
        arrs[i] = arrs[i] - arrs[j];
    }
    static void print(int[] arrs){
        for (int arr : arrs) {
            System.out.print(arr + " ");
        }
    }
}
