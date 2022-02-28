package malehunter.datastructure.leetcode;

import java.util.HashMap;

/**
 * @author congpeitong
 * @description 哈希表(key,value)
 * @date 2022-02-28 14:25
 */

// key--通过-->哈希函数---->找到内存地址------>key/value对应的内存地址
public class MyHashTable {
    /**
     * 哈希碰撞：2个不同的key ，通过同一个哈希函数得到了相同的内存地址
     *          解决方法1：使用链表
     * @param args
     */
    public static void main(String[] args) {
        // 1. 数组创建哈希表：数组的索引当作key,数组的值当作value
        String[] hashTable = new String[4];
        hashTable[0] = "hello";
        hashTable[1] = "word";
        hashTable[2] = "hello";
        hashTable[3] = "life";
        // 2. 创建
        HashMap<String, String> map = new HashMap<>();
        // 3. 操作
        map.put("0", "hello");
        map.put("1", "word");
        map.put("2", "hello");
        String life = map.put("3", "life");
        System.out.println(life);
        map.put("1","hello"); // 覆盖 key = 1 的值
        map.remove("0"); // 移除
        String s = map.get("0");
        boolean b = map.containsKey("0");
        int size = map.size();
        boolean empty = map.isEmpty();
    }
}
