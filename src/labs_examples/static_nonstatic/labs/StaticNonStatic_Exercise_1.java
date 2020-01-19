package labs_examples.static_nonstatic.labs;

public class StaticNonStatic_Exercise_1 {
    public static void main(String[] args) {
        Backpack bag1 = new Backpack("Book Bag");
        Backpack bag2 = new Backpack("Hiking");
        Backpack bag3 = new Backpack("Day Pack");

        Backpack.PortableOrNot(true);

        System.out.println();
    }

}
class Backpack {
    String type;
    static int strap;
    static boolean portable;


    public Backpack(String type) {
        this.type = type;
    }


    public static boolean PortableOrNot(boolean portable){
        if (portable){
            return true;
        }
        return false;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static void getStrap() {
        strap = 2;
    }

    public static void setStrap(int strap) {
        Backpack.strap = strap;
    }

    public static boolean isPortable() {
        return portable;
    }

    public static void setPortable(boolean portable) {
        Backpack.portable = portable;
    }
}
