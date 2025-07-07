package leetcode.linkedlist.leetcode146LruCache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    private class Node {
        int key, value;
        Node prev, next;
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int capacity;
    private final Map<Integer, Node> cache;
    private final Node head, tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();

        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }

    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    // tail 앞에 넣기
    private void insert(Node node) {
        Node last = tail.prev;
        last.next = node;
        node.prev = last;
        node.next = tail;
        tail.prev = node;
    }

    public int get(int key) {
        if (!cache.containsKey(key)) return -1;

        Node node = cache.get(key);
        remove(node); // 위치 갱신
        insert(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            remove(cache.get(key)); // 기존 노드 제거
        }

        Node newNode = new Node(key, value);
        insert(newNode);
        cache.put(key, newNode);

        if (cache.size() > capacity) {
            Node lru = head.next; // 가장 오래된 노드 (head 바로 다음)
            remove(lru);
            cache.remove(lru.key);
        }
    }

}
