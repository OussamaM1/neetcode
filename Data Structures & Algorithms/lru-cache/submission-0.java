class LRUCache {

    private static class Node {
        int value;
        int key;
        Node prev;
        Node next;
        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final HashMap<Integer, Node> cache;
    private final int capacity;
    private final Node head;
    private final Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.head = new Node(0,0);
        this.tail = new Node(0,0);
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }

    public void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void addToMustRecentlyUsed(Node node) {
        Node mru = tail.prev;
        mru.next = node;
        node.prev = mru;
        node.next = tail;
        tail.prev = node;
    }
    
    public int get(int key) {
        if(!cache.containsKey(key)) {
            return -1;
        }
        Node node = this.cache.get(key);
        remove(node);
        addToMustRecentlyUsed(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if(this.cache.containsKey(key)) {
            Node node = this.cache.get(key);
            node.value = value;
            remove(node);
            addToMustRecentlyUsed(node);
            return;
        }

        Node node = new Node(key, value);
        addToMustRecentlyUsed(node);
        this.cache.put(key, node);

        if(this.capacity < this.cache.size()) {
            Node lru = head.next;
            remove(lru);
            this.cache.remove(lru.key);
        }
    }
}
