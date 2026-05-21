class MyHashSet:
    def __init__(self):
        self.buckets = []
        for i in range(100):
            self.buckets.append([])

    def add(self, key: int) -> None:
        hsh = key % 100
        if key in self.buckets[hsh]:
            return

        self.buckets[hsh].append(key)

    def remove(self, key: int) -> None:
        hsh = key % 100
        if key in self.buckets[hsh]:
            self.buckets[hsh].remove(key)


    def contains(self, key: int) -> bool:
        hsh = key % 100
        return key in self.buckets[hsh]


# Your MyHashSet object will be instantiated and called as such:
# obj = MyHashSet()
# obj.add(key)
# obj.remove(key)
# param_3 = obj.contains(key)
