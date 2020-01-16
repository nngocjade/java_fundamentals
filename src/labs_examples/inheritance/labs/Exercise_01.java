package labs_examples.inheritance.labs;

/**
 * Inheritance Exercise 1:
 *
 *      1) Create one super class Class1 and two subclasses Class2 and Class3.
 *          -Class2 should extend Class1.
 *          -Class3 should extend Class2.
 *      2) Each class should have at least two instance variable, all private.
 *      3) Create getters and setters for all instance variables and demonstrate setting superclass
 *          variables from a subclass
 *
 *      4) Demonstrate the use of (non getter and setter) methods in a superclass from a subclass. //TODO ask ryan
 *
 *      5) Add constructors to each class and demonstrate the use of a superclass constructor
 *          from a subclass.
 *      6) Demonstrate constructor overloading and the use of the "super" keyword.
 *      7) Demonstrate method overloading.
 *
 *      NOTE: We encourage you to be creative and try to think of an example of your own for this
 *       exercise but if you are stuck, some ideas include:
 *
 *       - A Vehicle superclass, with Truck and Motorcycle subclasses.
 *       - A Restaurant superclass, with Gourmet and FastFood subclasses.
 *
 *
 */

//controller
class Exercise_01{
    public static void main(String[] args) {
        EBook ebooks = new EBook(350, "sci-fi", "digital","virtual", 20.25, "on the go", "kindle app");
        CrossPlatform crossPlatform = new CrossPlatform("on the go", "Apple Books", "Mac OS, Windows, Linux, etc.", "Ipad, Amazon Kindle,");
        Book books = new Book(500,"adventurous","digital","virtual", 54.99);

        System.out.println("This ebook has " + ebooks.pages + " pages " + "and can be accessed on various operating systems such as " + crossPlatform.getPlatform());

        //demonstrating method overriding
        ebooks.ReadingSpeed(40);
        books.ReadingSpeed(12);
        //overriding superclass method
        crossPlatform.ReadingSpeed(20);
    }

}

//superclass-1
class Book {
    //instance variables
    protected int pages; // at least 1 --> nth
    protected String genre;//romance, sci-fi, adventurous, mythical, history, poetry, biography, etc..
    protected String form; //physical or digital
    protected String storage; // shelf (physical location) or digitally
    protected double costs;//in most cases ebooks are cheaper than paperback
    //access modifier set as "protected" so subclasses can have access

    public int multiply(int pages, double costs){
        return (int) (pages*costs);
    }
    //default constructor
    public Book(){
        pages = 0;
        genre = " ";
        form = " ";
        costs = 0;
    }
    //constructors - overloading
    public Book(int pages, String genre, String form, String storage, double costs) {
        this.pages = pages;
        this.genre = genre;
        this.form = form;
        this.storage = storage;
        this.costs = costs;
    }

    //constructor - overloading
    public Book(int pages, String genre, double costs){
        this.pages = pages;
        this.genre = genre;
        this.costs = costs;
    }

    //method overriding example
    public void ReadingSpeed(int pages){
        System.out.println("Reading speed is " + pages + " pages per hour ");
    }

    //getter and setter
    public int getPages(int i) {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getStorage(String digitally) {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public double getCosts() {
        return costs;
    }

    public void setCosts(double costs) {
        this.costs = costs;
    }

    @Override
    public String toString() {
        return "Books{" +
                "pages=" + pages +
                ", genre='" + genre + '\'' +
                ", form='" + form + '\'' +
                ", storage='" + storage + '\'' +
                ", costs=" + costs +
                '}';
    }
}
//sub-class
class EBook extends Book {
    //instance variables
    private String portability;
    private String apps;


    //default constructor
    public EBook(){
        portability = " ";
        apps = " ";
        int x = multiply(2,3.99);
    }

    //constructor - overloading
    public EBook(String portability, String apps) {
        this.portability = portability;
        this.apps = apps;
    }

    //invoke parent(Books) constructor - overloading
    public EBook(int pages, String genre, String form, String storage, double costs, String portability, String apps) {
        super(pages, genre, form, storage, costs);
        this.portability = portability;
        this.apps = apps;
    }

    //getter and setter
    public String getPortability() {
        return portability;
    }

    public void setPortability(String portability) {
        this.portability = portability;
    }

    public String getApps() {
        return apps;
    }

    public void setApps(String apps) {
        this.apps = apps;
    }

    //to string
    @Override
    public String toString() {
        return "EBooks{" +
                "portability='" + portability + '\'' +
                ", apps='" + apps + '\'' +
                '}';
    }
}

//subclass of subclass
class CrossPlatform extends EBook{
    //instance variables
    private String platform;//mobile or desktop
    private String devices;//computer, kindle, phone, etc..

    //default constructor
    public CrossPlatform(){
        platform = " ";
        devices = " ";
    }

    //constructor
    public CrossPlatform(String platform, String devices) {
        this.platform = platform;
        this.devices = devices;
    }
    //invoked from parent(Ebooks) constructor
    public CrossPlatform(String portability, String apps, String platform, String devices) {
        super(portability, apps);
        this.platform = platform;
        this.devices = devices;
    }
    //invoked from parent(Ebooks) and parent of Ebooks(Books) constructor
    public CrossPlatform(int pages, String genre, String form, String storage, double costs, String portability, String apps, String platform, String devices) {
        super(pages, genre, form, storage, costs, portability, apps);
        this.platform = platform;
        this.devices = devices;
    }

    //getter and setter
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getDevices() {
        return devices;
    }

    public void setDevices(String devices) {
        this.devices = devices;
    }

    //to string
    @Override
    public String toString() {
        return "CrossPlatform{" +
                "platform='" + platform + '\'' +
                ", devices='" + devices + '\'' +
                '}';
    }
    //overriding super class (Books) method
    public void ReadingSpeed(int pages){
        System.out.println("lots of pages");
    }
}


