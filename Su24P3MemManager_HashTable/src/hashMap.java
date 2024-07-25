import java.util.*;

public class hashMap
{
    private KVPair[] table;
    private int size;
    private final int EMPTYKEY = -1;
    private KVPair e = null;
    private static final int INITIAL_CAPACITY = 16;

    public hashMap()
    {
        table = new KVPair[INITIAL_CAPACITY];
        size = 0;
    }


    private int hash(int key)
    {
        return Math.abs(key.hashCode()) % table.length;
    }


    public void hashInsert(int key, Seminar value)
    {
        if (size >= table.length * 0.5)
        {
            resize();
        }
        KVPair kvPair = new KVPair(key, value);
        int index = hash(key);
        while (table[index] != null && !table[index].getKey().equals(key))
        {
            index = (index + 1) % table.length;
        }
        table[index] = kvPair;
        size++;
    }


    public boolean hashSearch(K K)
    {
        int home;              // Home position for K
        int pos = home = h(K); // Initial position is the home slot
        for (int i = 1; (K != (table[pos]).getKey())
            && (EMPTYKEY != (table[pos]).getKey()); i++)
        {
            pos = (home + p(i)) % size; // Next on probe sequence
        }
        if (K == (table[pos]).getKey())
        {   // Found it
            e = table[pos];
            return true;
        }
        else
        {
            return false;
        }            // K not in hash table
    }


    private void resize()
    {
        KVPair[] oldTable = table;
        table = new KVPair[oldTable.length * 2];
        size = 0;
        for (KVPair kvPair : oldTable)
        {
            if (kvPair != null)
            {
                hashInsert(kvPair.getKey(), kvPair.getValue());
            }
        }
    }


    public int size()
    {
        return size;
    }


    private int h(K key)
    {
        return Math.abs(key.hashCode()) % table.length;
    }


    private int p(int i)
    {
        // Your probing function here. For example:
        return (i * i + 1) / 2;
    }
}
