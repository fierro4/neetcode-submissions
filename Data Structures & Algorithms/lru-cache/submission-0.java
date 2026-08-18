class LRUCache {

    class Node {
        int key;
        int val;
        Node prev;
        Node next;

        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    private int capacity;
    private HashMap<Integer, Node> map;
    private Node left;
    private Node right;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();

        left = new Node(0, 0);
        right = new Node(0, 0);

        left.next = right;
        right.prev = left;
    }

    private void remove(Node node) {
        Node prev = node.prev;
        Node next = node.next;

        prev.next = next;
        next.prev = prev;
    }

    private void insert(Node node) {
        Node prev = right.prev;

        prev.next = node;
        node.prev = prev;

        node.next = right;
        right.prev = node;
    }

    public int get(int key) {
        if(!map.containsKey(key)) {
            return -1;
        }

        Node node = map.get(key);

        remove(node);
        insert(node);

        return node.val;
    }

    public void put(int key, int value) {
        if(map.containsKey(key)) {
            Node node = map.get(key);

            remove(node);
            node.val = value;
            insert(node);
        }
        else {
            Node node = new Node(key, value);
            map.put(key, node);
            insert(node);

            if(map.size() > capacity) {
                Node lru = left.next;

                remove(lru);
                map.remove(lru.key);
            }
        }
    }
}