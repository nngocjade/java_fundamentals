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

class CustomHashMapController{
    public static void main(String[] args) {

        CustomHashMap<String, String> customHashMap = new CustomHashMap<>();

        customHashMap.put("a", "a");
        customHashMap.put("b", "b");
        customHashMap.put("c", "c");
        customHashMap.put("d", "d");
        customHashMap.put("e", "e");
        customHashMap.put("f", "f");

        System.out.println("Before");
        System.out.println(customHashMap.get("a"));
        System.out.println(customHashMap.get("b"));
        System.out.println(customHashMap.get("c"));
        System.out.println(customHashMap.get("d"));
        System.out.println(customHashMap.get("e"));
        System.out.println(customHashMap.get("f"));

        System.out.println("After");
        customHashMap.remove("b");
        customHashMap.print();
        System.out.println("\n");

        System.out.println(customHashMap.contains("a"));
        System.out.println(customHashMap.contains("b"));
        System.out.println(customHashMap.get("b"));






    }
}
class CustomHashMap<K, V>{

    // create the underlying HashMapNode array with the initial size of 10
    private Entry<K, V>[] currentArray = new Entry[10];

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
        Entry<K,V> entry = new Entry(key, value);

        if(currentArray[index] == null){

            currentArray[index] = entry;
        }
        else{
            // get the first Entry (in the linked list) at the given index
            Entry<K,V> head = currentArray[index]; //       "head"

            //traverse/loop the linked list
            while(head.getNext() != null){ //if it's not empty
                head = head.getNext();// continue looping
            }
            head.setNext(entry);
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
        Entry<K,V> entry = currentArray[index];

        while(entry.getKey() != key){

            if(entry.getNext() == null){
                return null;
            }

            //otherwise keep looing
            entry = entry.getNext();
        }
        return entry.getValue();
    }

    public void remove(K key){

        // ensure key exists by calling the get() method
        if (get(key) == null) {
            // if the get() method returns null, there's nothing to delete
            return;
        }
        // otherwise, get the index for the key by calling the hash() method
        int index = hashCode(key);

        // get the Entry at the index
        Entry<K, V> entry = currentArray[index];

        // if this entry has the matching key, remove the element at this index
        if (entry.getKey().equals(key) && entry.getNext() == null){
            currentArray[index] = null;
                return;
        }
        // otherwise, if the next element in the linked list is not null
        while (entry.getNext() != null && !entry.getNext().getKey().equals(key)) {
            // if the key of the next element in the linked list is not the key we're looking for
            entry = entry.next;
        }
        //if we are at the end of the list
        //null check
        if(entry.getNext() == null){
            return;
        }else if (entry.getNext().getKey().equals(key)){
            //middle of list
            if(null != entry.getNext().getNext()){
                entry.setNext(entry.getNext().getNext());
            }
            // otherwise, entry.next is the end of the list so we can just chop it off
            else {
                entry.setNext(null);
            }
        }
    }

    public boolean contains(K key){

        int index = hashCode(key);

        // nothing at key
        if (currentArray[index] == null) {
            System.out.println("empty, no key");
            return false;
        }
        //get entry at index
        Entry<K,V> entry = currentArray[index];

        while(null != entry){
            if(entry.getKey().equals(key)){
                return true;
            }
            //otherwise keep looping
            entry = entry.getNext();
        }
        return false;
    }

    public void print() {

        for(int i = 0; i < currentArray.length; i++){
            if(currentArray[i] == null) {
                continue;
            }
            System.out.println(currentArray[i]);

            Entry<K, V> iterator = currentArray[i];

            while(iterator.getNext() != null){
                System.out.println(iterator.getNext());
                iterator = iterator.getNext();
            }
        }
    }

}
class Entry<K, V> {
    private K key;
    private V value;
    protected Entry<K,V> next;

    public Entry() {
    }
    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public Entry(K key, V value, Entry<K, V> next) {
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

    public Entry<K, V> getNext() {
        return next;
    }

    public void setNext(Entry<K, V> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "key=" + key +
                ", value=" + value +
                ", next=" + next +
                '}';
    }
}
