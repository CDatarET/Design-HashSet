public class MyHashSet {
    private List<int>[] buckets;

    public MyHashSet() {
        buckets = new List<int>[100];
    }

    public void Add(int key) {
        if(Contains(key)) return;

        int hash = key % 100;

        if (buckets[hash] == null) {
            buckets[hash] = new List<int>();
        }

        buckets[hash].Add(key);
    }

    public void Remove(int key) {
        int hash = key % 100;

        if (buckets[hash] == null) return;

        for (int i = 0; i < buckets[hash].Count; i++) {
            if (buckets[hash][i] == key) {
                buckets[hash].RemoveAt(i);
                break;
            }
        }
    }

    public bool Contains(int key) {
        int hash = key % 100;

        if (buckets[hash] == null) return false;

        for (int i = 0; i < buckets[hash].Count; i++) {
            if (buckets[hash][i] == key) {
                return true;
            }
        }

        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.Add(key);
 * obj.Remove(key);
 * bool param_3 = obj.Contains(key);
 */
