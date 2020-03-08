package labs_examples.datastructures.hashmap.labs;

import java.lang.reflect.Array;
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


        // create the hashmapthe "key" will be the email, a String
        // and the "value" will the Person object
        HashMap<Integer, Country> countryHashMap = new HashMap<>();
        int [] array = new int[10];

        //create a few Country objects
        Country japan = new Country("Japan", "Tokyo", 126476461);
        Country indonesia = new Country("Indonesia", "Jakarta", 273523615);
        Country mexico = new Country("Mexico", "Mexico City", 128932753);
        Country philippines = new Country("Philippines", "Manila", 109581078);
        Country vietnam = new Country("Vietnam", "Saigon", 97338579);

        //demonstrating "put" the Country object into the HashMap
        countryHashMap.put(japan.getNumOfPopulation(), japan);

        //demonstrating "getting" an element out of the HashMap
        Country getElement = countryHashMap.get(126476461);
        System.out.println(getElement.toString());

        //demonstrating "putAll" all country object into the HashMap

//        countryHashMap.putAll();
//        countryHashMap.size();
//        countryHashMap.containsKey(32);
//        countryHashMap.keySet();
//        countryHashMap.entrySet();
//        countryHashMap.putIfAbsent();
//        countryHashMap.remove();
//        countryHashMap.replace();
//        countryHashMap.forEach();
//        countryHashMap.clear();





    }
}
class Country{
    String name;
    String capital;
    int numOfPopulation;

    public Country(String name, String capital, int numOfPopulation) {
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

    public int getNumOfPopulation() {
        return numOfPopulation;
    }

    public void setNumOfPopulation( int numOfPopulation) {
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
