package datastuctures.map;

import java.util.LinkedList;

class CustomHashMap<K, V> {
    private static final int SIZE = 16; // bucket size
    private LinkedList<Entry<K, V>>[] buckets;

    static class Entry<K, V> {
        K key;
        V value;
        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    @SuppressWarnings("unchecked")
    public CustomHashMap() {
        buckets = new LinkedList[SIZE];
    }

    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode() % SIZE);
    }

    public void put(K key, V value) {
        int index = getBucketIndex(key);
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }
        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                entry.value = value; // <-- COLLISION RESOLUTION: replace value
                return;
            }
        }
        buckets[index].add(new Entry<>(key, value)); // <-- COLLISION RESOLUTION: add new entry
    }


    public V get(K key) {
        int index = getBucketIndex(key);
        if (buckets[index] != null) {
            for (Entry<K, V> entry : buckets[index]) {
                if (entry.key.equals(key)) {
                    return entry.value;
                }
            }
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        CustomHashMap<Integer, String> map = new CustomHashMap<>();
        map.put(1, "Neera j");
        map.put(2, "Sonu");
        map.put(2,"Swati");

        System.out.println(map.get(1)); // Output: Neera j
        System.out.println(map.get(2)); // Output: Sonu
    }
}
