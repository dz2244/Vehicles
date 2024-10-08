public class Regular extends Vehicles{
    int passengers;

    @Override
    public String toString() {
        return "Regular{" +
                "passengers=" + passengers +
                '}';
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
    @Override
    public double exhaust(){
        return super.exhaust()*24;
    }
}
