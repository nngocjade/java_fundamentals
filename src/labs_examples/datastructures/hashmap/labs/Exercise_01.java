package labs_examples.datastructures.hashmap.labs;

import java.util.HashMap;

/**
 *  HashMaps Exercise_01
 *
 *  Demonstrate you're mastery of using Java's built-in HashMap class below.
 *
 *  Using a HashMap demonstrate the use of the following methods:
 *
 *  put()
 *  get()
 *  putAll()
 *  size()
 *  contains()
 *  keySet()
 *  entrySet()
 *  putIfAbsent()
 *  remove()
 *  replace()
 *  forEach()
 *  clear()
 *
 */

class HashMapsPractice{
    public static void main(String[] args) {

        String [] anArray = {"Japan", "Africa", "United States", "Canada", "South America"};

        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("Japan", "Narita");
        hashMap.get("Japan");


    }
}
