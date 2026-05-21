class MyHashSet {
    ArrayList<Integer>[] buckets;

    public MyHashSet() {
        this.buckets = new ArrayList[100];
    }
    
    public void add(int key) {
        if(contains(key)){
            return;
        }

        int hash = key % 100;
        if(buckets[hash] == null){
            buckets[hash] = new ArrayList<>();
        }
        buckets[hash].add(key);
    }
    
    public void remove(int key) {
        int hash = key % 100;
        if(buckets[hash] == null){
            return;
        }

        for(int i = 0; i < buckets[hash].size(); i++){
            if(buckets[hash].get(i) == key){
                buckets[hash].remove(i);
                break;
            }
        }
    }
    
    public boolean contains(int key) {
        int hash = key % 100;
        if(buckets[hash] == null){
            return(false);
        }

        for(int i = 0; i < buckets[hash].size(); i++){
            if(buckets[hash].get(i) == key){
                return(true);
            }
        }

        return(false);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
