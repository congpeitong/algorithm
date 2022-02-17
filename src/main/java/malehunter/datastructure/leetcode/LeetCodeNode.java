package malehunter.datastructure.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;

/**
 * @createUser： congpeitong
 * @createTime： 2022/2/17
 * @describe：
 */
public class LeetCodeNode {
    /**
     * 1. 算法的时间复杂度 大 O 表示：
     *    （1）.算法的执行时间和算法的输入值之间的关系
     *    （2）.O(1) O(log^n) O(n) O(nlog^n) O(n^2)
     */
    public int O1(int num) {
        // 时间复杂度O(1) 算法的执行时间和输入值之间是没有关系的
        int i = num*2;
        return i + num;
    }

    public int OlogN(int num) {
        int i = 1;
        while (i < num) {
            i = i*2;
        }
        return i;
    }

    public int ON(int num) {
        int total = 0;
        for (int i = 0; i < num; i++) {
            total += i;
        }
        return total;
    }

    // O(M) + O(N)
    public int OMN(int num1, int num2) {
        int total = 0;
        for (int i = 0; i < num1; i++) {
            total += i;
        }
        for (int j = 0; j < num2; j++) {
            total += j;
        }
        return total;
    }

    public int ONLOGN(int num1, int num2) {
        int total = 0;
        int j =0;
        for (int i = 0; i < num1; i++) {
            while (j < num2) {
                total += i + j;
                j = j*2;
            }
        }
        return total;
    }

    public int ON2(int num1, int num2) {
        int total = 0;
        for (int i = 0; i < num1; i++) {
            for (int i1 = 0; i1 < num2; i1++) {
                total += i1;
            }
        }
        return total;
    }

    /**
     * 2. 算法的空间复杂度: 算法的存储空间和输入值之间的关系
     *    O
     * 为了和时间复杂度区别方法名加前缀S  SPACE首字母
     */

    public int SO1(int num) {
        int total = 0;
        for (int i = 0; i < num; i++) {
            total += i;
        }
        return total;
    }

    public List<Integer> SON(int num) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            integers.add(i);
        }
        return integers;
    }

    /**
     * 3. 数据结构Array数组知识点：
     *    在  连续  的内存空间中，存储一组  相同类型   的元素
     *    访问  时间复杂度 O(1)
     *    搜索  时间复杂度 O(N)
     *    插入  时间复杂度 O(N)
     *    删除  时间复杂度 O(N)
     *    数组的特点： 适合读，不适合写，使用场景读多写少
     */

    public static void createArray() {
        /**
         * 创建数组四种方式
         */
        int[] array1 = {1,2,3,4};
        // array1[5] = 4; ArrayIndexOutOfBoundsException

        System.out.println();
        int[] array2 = new int[]{1,2,3,4,5};
        int[] ayyay3 = new int[5];
        ArrayList<Integer> array4 = new ArrayList<>();

    }

    public static void main(String[] args) {
        createArray();

    }





















}
