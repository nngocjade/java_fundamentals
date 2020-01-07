package labs_examples.objects_classes_methods.labs.objects;

/**
 * Please demonstrate Object association by creating at least two POJOs and a Controller class. The Controller
 * class will contain the main() method. In the main() create an object of each POJO you just created and associate
 * the two together. (This is easier than it sounds. Refer to the Object Association documentation if you're not sure.)
 */

//The Controller
    //ChairPersonTable Association
public class Exercise_2 {
    public static void main(String[] args) {
        Chair myChair = new Chair("rocking chair");
        Person person = new Person("Julia");
        Table myTable = new Table( "coffee table");

        System.out.println("With her book in one arm and the other holding a coffee mug, " + "\n" + person.name +
                " gently sets the mug down on the " + myTable.style + " and sits in the " + myChair.style + " - to enjoy her morning routine.");
    }

}

//POJO 1
class Chair {
    String style;

    public Chair (String style){
        this.style = style;
    }
}
//POJO 2
class Person {
    String name;

    public Person (String name){
        this.name = name;
    }
}
//POJO 3
class Table {
    String style;

    public Table (String style){
        this.style = style;
    }
}
