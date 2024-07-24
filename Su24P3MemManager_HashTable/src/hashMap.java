import java.util.*;

public class hashMap<K extends Comparable<K>, V> {
    private KVPair<K, V>[] table;
    private int size;
    private final K EMPTYKEY = null;
    private static final int INITIAL_CAPACITY = 16;

    public hashMap() {
        table = new KVPair[INITIAL_CAPACITY];
        size = 0;
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % table.length;
    }

    public void hashInsert(K key, V value) {
        if (size >= table.length * 0.5) {
            resize();
        }
        KVPair<K, V> kvPair = new KVPair<>(key, value);
        int index = hash(key);
        while (table[index] != null && !table[index].getKey().equals(key)) {
            index = (index + 1) % table.length;
        }
        table[index] = kvPair;
        size++;
    }

    public V hashSearch(K K) {
    	 int home;              // Home position for K
         int pos = home = h(K); // Initial position is the home slot
         for (int i = 1;
              (K != (table[pos]).getKey()) && (EMPTYKEY != (table[pos]).getKey());
              i++) {
           pos = (home + p(K, i)) % M; // Next on probe sequence
              }
         if (K == (table[pos]).getKey()) {   // Found it
           e = HT[pos];
           return true;
         }
         else { return false; }            // K not in hash table
       }

    private void resize() {
        KVPair<K, V>[] oldTable = table;
        table = new KVPair[oldTable.length * 2];
        size = 0;
        for (KVPair<K, V> kvPair : oldTable) {
            if (kvPair != null) {
                hashInsert(kvPair.getKey(), kvPair.getValue());
            }
        }
    }

    public int size() {
        return size;
    }
    
    private int h(K key)
    {
    	return Math.abs(key.hashCode())%table.length;
    }
    private int p(int i) {
        // Your probing function here. For example:
        return (i * i + 1) / 2;
    }
}