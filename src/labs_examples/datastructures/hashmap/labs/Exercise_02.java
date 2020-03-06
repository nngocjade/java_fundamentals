package labs_examples.datastructures.hashmap.labs;

import labs_examples.datastructures.hashmap.examples.Entry;

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
    private HashMapNode<K, V>[] anArray = new HashMapNode[10];





    public <V, K> void put(K key, V value) throws ListIsEmptyException {
        //checking
        if(key == null){
            throw new ListIsEmptyException("list is empty");
        }


    }
    public <V> void get(K key){

    }
    public boolean remove(K key){

    }
    public boolean contains(K key){

    }
}
class HashMapNode<K, V> {
    private K key;
    private V value;
    private HashMapNode<K, V> next;

    public HashMapNode() {
    }
    public HashMapNode(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public HashMapNode(K key, V value, HashMapNode<K, V> next) {
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
    public HashMapNode<K, V> getNext() {
        return next;
    }
    public void setNext(HashMapNode<K, V> next) {
        this.next = next;
    }

}
class ListIsEmptyException extends Exception {

    public ListIsEmptyException(String message) {
        super(message);
    }
}