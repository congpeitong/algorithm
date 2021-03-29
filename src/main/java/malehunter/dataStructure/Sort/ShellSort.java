package malehunter.dataStructure.Sort;

/**
 * @ClassName ShellSort
 * @Description 希尔排序
 * @Autor MaleHunter
 * @Date 2021-03-29 10:17
 * @Version 1.0
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arrs = {5,3,6,8,1,7,9,4,2,12,23,232,123};
        sort(arrs);
        print(arrs);

    }
    static void sort(int[] arrs){
        // 排序间隔
        //int gap =4;
        int h = 1;
        while ( h <= arrs.length / 3) {
            h = h*3 + 1;
        }
        for (int gap = h; gap > 0 ; gap = (gap-1)/3){
            for (int i = gap; i < arrs.length; i++) {
                for (int j = i; j>gap - 1; j -= gap){
                    if (arrs[j] < arrs[j-gap]){
                        swap(arrs,j,j - gap);
                    }
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
