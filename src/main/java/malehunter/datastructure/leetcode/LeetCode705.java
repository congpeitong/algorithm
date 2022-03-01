package malehunter.datastructure.leetcode;


/**
 * @author congpeitong
 * @date 2022-03-01 13:42
 * /**
 *  * Your MyHashSet object will be instantiated and called as such:
 *  * MyHashSet obj = new MyHashSet();
 *  * obj.add(key);
 *  * obj.remove(key);
 *  * boolean param_3 = obj.contains(key);
 *  */
public class LeetCode705 {

    boolean[] myset;

    public LeetCode705() {
       myset = new boolean[1000000];
    }

    public void add(int key) {
        myset[key] = true;
    }

    public void remove(int key) {
        myset[key] = false;

    }

    public boolean contains(int key) {
        return myset[key];
    }

}
