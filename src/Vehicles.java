public class Vehicles {
    public int license;
    public int age;
    public int wheels;
    public String steering;
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

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getSteering() {
        return steering;
    }

    public void setSteering(String steering) {
        this.steering = steering;
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
                ", steering='" + steering + '\'' +
                ", pollution=" + pollution +
                '}';
    }
    public double exhaust(){
        return pollution*60;
    }
}
