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



        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Japan", 32);
        hashMap.get("Japan");
        hashMap.putAll();
        hashMap.size();
        hashMap.containsKey(32);
        hashMap.keySet();





    }
}
class Country{
    String name;
    String capital;
    Double numOfPopulation;

    public Country(String name, String capital, Double numOfPopulation) {
        this.name = name;
        this.capital = capital;
        this.numOfPopulation = numOfPopulation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Double getNumOfPopulation() {
        return numOfPopulation;
    }

    public void setNumOfPopulation(Double numOfPopulation) {
        this.numOfPopulation = numOfPopulation;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", numOfPopulation=" + numOfPopulation +
                '}';
    }
}
