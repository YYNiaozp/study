package leetcode.other;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2022/6/9 15:28
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 实现 LRUCache 类：
 * LRUCache(int capacity) 以 正整数 作为容量 capacity 初始化 LRU 缓存
 * int get(int key) 如果关键字 key 存在于缓存中，则返回关键字的值，否则返回 -1 。
 * void put(int key, int value) 如果关键字 key 已经存在，则变更其数据值 value ；如果不存在，则向缓存中插入该组 key-value 。如果插入操作导致关键字数量超过 capacity ，则应该 逐出 最久未使用的关键字。
 * 函数 get 和 put 必须以 O(1) 的平均时间复杂度运行。
 */
public class _146LRUCache {
    class DLinkedNode {
        int key;
        int val;
        DLinkedNode prev;
        DLinkedNode next;

        public DLinkedNode() {
        }

        public DLinkedNode(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    private Map<Integer, DLinkedNode> cache = new HashMap<Integer, DLinkedNode>();
    private int size;
    private int capacity;
    private DLinkedNode head, tail;

    public _146LRUCache(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        head = new DLinkedNode();
        tail = new DLinkedNode();
        head.next = tail;
        tail.prev = tail;
    }

    public int get(int key) {
        DLinkedNode node = cache.get(key);
        if (node == null){
            return -1;
        }
        // 如果 key 存在，先通过哈希表定位，再移到头部
        moveToHead(node);
        return node.val;
    }

    private void moveToHead(DLinkedNode node) {
        removeNode(node);
        addToHead(node);
    }

    private void removeNode(DLinkedNode node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void addToHead(DLinkedNode node){
        node.prev = head;
        node.next = head.next;
        node.next.prev = node;
        head.next = node;
    }

    private DLinkedNode removeTail(){
        DLinkedNode node = tail.prev;
        removeNode(node);
        return node;
    }

    public void put(int key, int value) {
        DLinkedNode node = cache.get(key);
        if (node == null){
            node = new DLinkedNode(key, value);
            cache.put(key, node);
            addToHead(node);
            ++size;
            if (size > capacity){
                DLinkedNode tail = removeTail();
                cache.remove(tail.key);
                --size;
            }
        } else {
            // 如果 key 存在，先通过哈希表定位，再修改 value，并移到头部
            node.val = value;
            moveToHead(node);
        }
    }
}
