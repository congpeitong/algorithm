package malehunter.datastructure.Sort;

/**
 * @ClassName SelectionSort
 * @Description 选择排序算法
 * @Autor MaleHunter
 * @Date 2021-03-26 13:10
 * @Version 1.0
 */
public class SelectionSort {
    public static void main(String[] args) {
        // 需要排序的数组
        int[] arrs = {5,3,6,8,1,7,9,4,2,12,23,232,123};
        // 最小值位置的索引
        int minPositio = 0;
        for ( int i = 0; i<arrs.length - 1; i++){
            // 每次遍历比较后重置minPosition的值
            minPositio = i;
            for (int j=i+1; j<arrs.length; j++){
//                if (arrs[j] < arrs[minPosition]){
//                    // minPositon 赋值最小值的索引
//                    minPosition = j;
//                }
                minPositio = arrs[j] < arrs[minPositio] ? j : minPositio;
            }
                // 交换位置
//            int temp = arrs[i];
//            arrs[i] = arrs[minPosition];
//            arrs[minPosition] = temp;
            if (arrs[i] != arrs[minPositio]){
                arrs[i] = arrs[i] + arrs[minPositio];
                arrs[minPositio] = arrs[i] - arrs[minPositio];
                arrs[i] = arrs[i] - arrs[minPositio];
            }

        }
        // print
        for (int arr : arrs) {
            System.out.print(arr + " ");
        }
    }
}
