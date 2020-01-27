package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

public class Survey extends NailTechnician {
    private int rate;
    private String feedback;

    public Survey(String skill) {
        super(skill);
    }

    public Survey(int time, int date) {
        super(time, date);
    }

    public Survey(int time, int date, double businessHour) {
        super(time, date, businessHour);
    }

    public Survey(String firstName, String lastName, int phoneNum, String email) {
        super(firstName, lastName, phoneNum, email);
    }
}
