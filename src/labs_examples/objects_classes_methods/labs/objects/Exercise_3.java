package labs_examples.objects_classes_methods.labs.objects;

/**
 * For this exercise please create two classes. The first class is the controller and it will contain the main() method.
 * The second class is a POJO. Just a simple object type class that defines an object. In this POJO, demonstrate
 * at least three overloaded constructors. In the main() method, create at least 3 objects of your POJO class, each using
 * a different constructor.
 */


//controller class - contains main() method
//at least 3 objects of POJO class
//each with a different constructor
public class Exercise_3 {
    public static void main(String[] args) {
        Jean person = new Jean ("Bob", "Jimmy", "Drew");
        Jean 
    }



}


//a POJO
//3 overloaded constructors
class Jean{
    String size;
    int numSize;
    int bust;
    double waist;
    int hip;

    int inseam;
    String style;

    String personA;
    String personB;
    String personC;

    public Jean(String size, int numSize, int bust, double waist, int hip){
        this.size = size;
        this.numSize =numSize;
        this.bust = bust;
        this.waist = waist;
        this.hip = hip;

    }
    public Jean(int inseam, String style){
        this.inseam = inseam;
        this.style = style;
    }
    public Jean(String personA, String personB, String personC){
       this.personA = personA;
       this.personB = personB;
       this.personC = personC;
    }
}

