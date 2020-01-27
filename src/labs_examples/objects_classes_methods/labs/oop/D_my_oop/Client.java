package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

//subclass
public class Client extends BookingSystem {
    private String interest;
    private String style;
    private String request;

    public Client(int time, int date) {
        super(time, date);
    }

    public Client(String interest, String style, String request) {
        this.interest = interest;
        this.style = style;
        this.request = request;
    }

    public Client(String firstName, String lastName, int phoneNum, String email) {
        super(firstName, lastName, phoneNum, email);
    }
}
