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
        Jean sizeChart = new Jean("S", 6, 36, 28.5, 38);
        Jean fit = new Jean(27, "BoyFriend");
        Jean bodyType = new Jean("S", "PL", "Pe");
    }
}


//a POJO
//3 overloaded constructors
class Jean{
    //size chart
    String size;
    int numSize;
    int bust;
    double waist;
    int hip;

    //style or fit
    int inseam;
    String style;

    //body type - (standard, plus, petit)
    String standard;
    String plusSize;
    String petit;


    public Jean(String size, int numSize, int bust, double waist, int hip){
        this.size = size;
        this.numSize = numSize;
        this.bust = bust;
        this.waist = waist;
        this.hip = hip;
    }
    public Jean(int inseam, String style){
        this.inseam = inseam;
        this.style = style;
    }
    public Jean(String standard, String plusSize, String petit){
        this.standard = standard;
        this.plusSize = plusSize;
        this.petit = petit;
    }

}

