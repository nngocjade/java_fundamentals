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


        // create the hashmapthe "key" will be the email, a String
        // and the "value" will the Person object
        HashMap<String, Country> countryHashMap = new HashMap<>();

        //create a few Country objects
        Country japan = new Country("Japan", "Tokyo", 126476461);
        Country indonesia = new Country("Indonesia", "Jakarta", 273523615);
        Country mexico = new Country("Mexico", "Mexico City", 128932753);
        Country philippines = new Country("Philippines", "Manila", 109581078);
        Country vietnam = new Country("Vietnam", "Saigon", 97338579);


        countryHashMap.put("");
        countryHashMap.get("Japan");
        countryHashMap.putAll();
        countryHashMap.size();
        countryHashMap.containsKey(32);
        countryHashMap.keySet();





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
