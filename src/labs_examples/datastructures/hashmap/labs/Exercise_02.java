package labs_examples.datastructures.hashmap.labs;

/**
 *      HashMaps Exercise_02
 *
 *      Rewrite the CustomHashMap class to meet the following requirements:
 *      1) no method has the same name as any in CustomHashMap
 *          (do not use refactor - do it manually)
 *      2) no variable has the same name as any in CustomHashMap
 *          (do not use refactor - do it manually)
 *      3) resize the HashMap when the underlying array is more than half full
 *      4) triple the size of the underlying array on resize()
 *      5) instead of checking the number of keys to resize, check the number of values
 *      6) on collisions, add new elements to the front of the LinkedList, not the end
 *      7) anytime someone tries to get/update/remove an element that does not exist, print
 *          out a message indicating that the element does not exist
 *      8) add at least one more method that you think could be useful to the HashMap
 *          review Java's built-in HashMap for inspiration
 */

class customHashMap<K, V>{

    // create the underlying HashMapNode array with the initial size of 10
    private HashMapNodeEntry<K, V>[] currentArray = new HashMapNodeEntry[10];

    private int hashCode(K key){
        // get the hashCode for the key and mod that hashCode by the length of the array
        int index = Math.abs(key.hashCode() % currentArray.length);

        // the result will be the index where we can find and/or place entries
        return index;
    }
    //put aka insert, responsible for adding elements into the HashMap
    public void put(K key, V value) {
        // call the hash() method to get the index to place the element
        int index = hashCode(key);

        //create the HashMapNode object containing the key and
        //value that we will store in the underlying array called arrayMap
        HashMapNodeEntry<K,V> hashMapNodeEntry = new HashMapNodeEntry<K,V>(key, value);

        if(currentArray[index] == null){

            currentArray[index] = hashMapNodeEntry;
        }
        else{
            // get the first Entry (in the linked list) at the given index
            HashMapNodeEntry<K,V> head = currentArray[index]; //       "head"

            //traverse/loop the linked list
            while(head.getNext() != null){ //if it's not empty
                head = head.getNext();// continue looping
            }
            head.setNext(hashMapNodeEntry);
        }

//        if (keys().size() > .length * .75) {
//            // the resize method will create a bigger underlying array and
//            // add all values in the existing array to the new, larger array
//            resize();
//        }

    }
    public V get(K key){
        // call the hash() method to get the index for the key
        int index = hashCode(key);

        // nothing at key - return null
        if (currentArray[index] == null) {
            return null;
        }
        //get entry at index
        HashMapNodeEntry<K,V> headEntry = currentArray[index];

        while(headEntry.getKey() != key){

            if(headEntry.getNext() == null){
                return null;
            }

            //otherwise keep looing

            headEntry = headEntry.getNext();
        }


    }

    public boolean remove(K key){

    }
    public boolean contains(K key){

    }
}
class HashMapNodeEntry<K, V> {
    private K key;
    private V value;
    private HashMapNodeEntry next;

    public HashMapNodeEntry() {
    }

    public HashMapNodeEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public HashMapNodeEntry(K key, V value, HashMapNodeEntry next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public HashMapNodeEntry getNext() {
        return next;
    }

    public void setNext(HashMapNodeEntry next) {
        this.next = next;
    }
}
