/**
 * This class holds a generic Key-value pair implementation. The purpose of this
 * class is to hold generic KVPair object which will be stored in the BST.
 * There is also a toString method for easily translating the objects contained
 * in the KVPair into a human readable string.
 * 
 * @author CS Staff, Nick Flammer (nickf55), Nicolas Goossens (nicolas04)
 * 
 * @version 2024-05-22
 * @param <K>
 *            Key to be used
 * @param <V>
 *            Value to be associated with the key
 */

// public class KVPair<K, V> implements Comparable<KVPair<K, V>> {
// Another Implementation choice is to require KPair to implement Comparable not
// K
public class KVPair{

    // the object to be a key
    private int key;
    // the object to be the value at the key
    private Seminar value;
    
    private boolean otherCompare;

    /**
     * The constructor assigns value to the key and value fields from user
     * specified objects.
     * 
     * @param strKey
     *            the key for the KVPair
     * @param val
     *            the value for the KVPair
     */
    public KVPair(int strKey, Seminar val) {
        this.key = strKey;
        this.value = val;
        this.otherCompare = false;
    }


    /**
     * Returns the key of this KVPair
     *
     * @return the key of the KVPair
     */
    public int getKey() {
        return key;
    }


    /**
     * Returns the value of this KVPair
     *
     * @return the value that the KVPair holds
     */
    public Seminar getValue() {
        return value;
    }
    
    /**
     * Called when the KVPairs need to compare by value, not key
     */
    public void setCompareMethod() {
        this.otherCompare = true;
    }


    /**
     * Returns the KVPair in a human readable format.
     *
     * @return A human readable string representing the KVPair object
     */
    public String toString() {
        return String.format("%s, %s", getKey(), getValue());
    }
//
//
//    /**
//     * You should implement the compareTo method from the Comparable interface.
//     * This will be used to easily compare two KVPair objects depending on if 
//     * they are getting compared to by value. Otherwise, they will be compared 
//     * to by key.
//     *
//     * @param o
//     * @return
//     */
//    @Override
//    public int compareTo(KVPair<K, V> o) {
//        if (o.otherCompare) {
//            if (getValue().equals(o.getValue())) {
//                return 0;
//            }
//        }
//        return getKey().compareTo(o.getKey());
//    }
//    
//    /**
//     * Checks if the pairs are equal based on key and value.
//     * 
//     * @param other The other pair
//     * @return The result of if they are equal or not
//     */
//    @SuppressWarnings("unchecked")
//    public boolean equals(Object other) {
//        if (other == null || other.getClass() != this.getClass()) {
//            return false;
//        }
//        KVPair<K, V> otherKV = (KVPair<K, V>) other;
//        return otherKV.key == this.key && otherKV.value == this.value;
//    }
}
