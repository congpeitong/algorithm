package malehunter.datastructure.Test;

/**
 * @ClassName test2
 * @Description 相等数值进行加减交换
 * @Autor MaleHunter
 * @Date 2021-03-26 14:31
 * @Version 1.0
 */
public class test2 {
    public static void main(String[] args) {
        // 需要排序的数组
        int[] arrs = {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
        // 最小值位置的索引
        int minPositio = 0;
        for ( int i = 0; i<arrs.length - 1; i++){
            // 每次遍历比较后重置minPosition的值
            minPositio = i;
            for (int j=i+1; j<arrs.length; j++){
               if (arrs[j] < arrs[minPositio]){
                   // minPositon 赋值最小值的索引
                  minPositio = j;
             }
             //   minPositio = arrs[j] < arrs[minPositio] ? j : minPositio;
            }
            // 交换位置
//           int temp = arrs[i];
 //          arrs[i] = arrs[minPositio];
 //          arrs[minPositio] = temp;
           // if (arrs[i] != arrs[minPositio]){
               arrs[i] = arrs[i] + arrs[minPositio];
                arrs[minPositio] = arrs[i] - arrs[minPositio];
                arrs[i] = arrs[i] - arrs[minPositio];
          // }

        }
        // print
        for (int arr : arrs) {
            System.out.print(arr + " ");
        }
    }
}
