package malehunter.datastructure.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Set集合：
 *      特点：无序,不重复
 *      HashSet:
 *          哈希集合实质上背后是一张哈希表
 *          元素---->哈希函数------>哈希值 ------>哈希表---->无元素则直接存，有元素则进行对比，相等则更新，不相等则产生哈希冲突
 *      TreeSet,LinkSet
 * List集合：
 *      特点：有序，可重复
 * 所谓有序，无序，不是排序而是按照添加的顺序存储
 * @author congpeitong
 * @date 2022-03-01 10:35
 */
public class MySet {

    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();

        boolean add = hashSet.add(1);
        boolean remove = hashSet.remove(2);
        boolean contains = hashSet.contains(1);
        int size = hashSet.size();


    }
}
