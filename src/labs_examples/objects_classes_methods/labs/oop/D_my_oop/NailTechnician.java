package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

//subclass
public class NailTechnician extends BookingSystem {
    private String skill;

    public NailTechnician(String skill) {
        this.skill = skill;
    }

    public NailTechnician(int time, int date) {
        super(time, date);

    }

    public NailTechnician(int time, int date, double businessHour) {
        super(time, date, businessHour);
    }

    public NailTechnician(String firstName, String lastName, int phoneNum, String email) {
        super(firstName, lastName, phoneNum, email);

    }
}
