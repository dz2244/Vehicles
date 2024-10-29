public class Vehicles {
    public int license;
    public int age;
    public int wheels;
    public boolean wheelSteering;
    public double pollution;

    public int getLicense() {
        return license;
    }

    public void setLicense(int license) {
        this.license = license;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getWheelSteering() {
        return wheelSteering;
    }

    public void setWheelSteering(boolean wheelSteering) {
        this.wheelSteering = wheelSteering;
    }

    public double getPollution() {
        return pollution;
    }

    public void setPollution(double pollution) {
        this.pollution = pollution;
    }
    @Override
    public String toString() {
        return "Vehicles{" +
                "license=" + license +
                ", age=" + age +
                ", wheels=" + wheels +
                ", wheelSteering='" + wheelSteering  +
                ", pollution=" + pollution +
                '}';
    }
    public double exhaust(){
        return pollution*60;
    }
}
