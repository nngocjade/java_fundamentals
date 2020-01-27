package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

//superclass
public class BookingSystem {

    private int time;
    private int date;
    private double businessHour;

    private static int person;
    private String firstName;
    private String lastName;
    private int phoneNum;
    private String email;

    private int group;

    private String service;

    public BookingSystem(){
    }

    public BookingSystem(int time, int date) {
        this.time = time;
        this.date = date;
    }

    public BookingSystem(int time, int date, double businessHour) {
        this.time = time;
        this.date = date;
        this.businessHour = businessHour;
    }

    public BookingSystem(String firstName, String lastName, int phoneNum, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNum = phoneNum;
        this.email = email;
    }

    public BookingSystem(int time, int date, double businessHour, String firstName, String lastName, int phoneNum, String email, int group, String service) {
        this.time = time;
        this.date = date;
        this.businessHour = businessHour;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNum = phoneNum;
        this.email = email;
        this.group = group;
        this.service = service;
    }
}
