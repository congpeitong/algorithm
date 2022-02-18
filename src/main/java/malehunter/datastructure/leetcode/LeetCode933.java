package malehunter.datastructure.leetcode;

import com.sun.deploy.pings.Pings;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @createUser： congpeitong
 * @createTime： 2022/2/18
 * @describe： 最近的请求次数
 *             写一个 RecentCounter 类来计算特定时间范围内最近的请求。
 *             RecentCounter() 初始化计数器，请求数为 0 。
 *            int ping(int t) 在时间 t 添加一个新请求，其中 t 表示以毫秒为单位的某个时间，
 *            并返回过去 3000 毫秒内发生的所有请求数（包括新请求）。
 *            确切地说，返回在 [t-3000, t] 内发生的请求数。
 *
 */
public class LeetCode933 {
    Queue<Integer> queue;
    public LeetCode933() {
       queue = new LinkedList<>();
    }
    public int ping(int t) {
        queue.add(t);
        while (queue.size() != 0 && queue.peek()< (t-3000)) {
            queue.poll();
        }
        return queue.size();
    }





}
