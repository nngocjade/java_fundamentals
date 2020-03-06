package labs_examples.Bali_InPerson_MarApr2020.Day2_Tues_Mar_3.InputOutput.Example;


public class Person {
    private int id;
    private String name;
    private String home;
    public Person(int id, String name, String home) {
        this.id = id;
        this.name = name;
        this.home = home;
    }
    public Person() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getHome() {
        return home;
    }
    public void setHome(String home) {
        this.home = home;
    }
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", home='" + home + '\'' +
                '}';
    }
}
