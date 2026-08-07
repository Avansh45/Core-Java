package Project.BusBookingSystem.model;

public class Passenger {
    private int passengerId;
    private String passengerName;
    private int age;
    private Gender gender;
    private String phone;

    public Passenger() {
    }

    public Passenger(int passengerId, String passengerName, int age, Gender gender, String phone) {
        this.passengerId = passengerId;
        this.passengerName = passengerName;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "passengerId=" + passengerId +
                ", passengerName='" + passengerName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", phone='" + phone + '\'' +
                '}';
    }
}
