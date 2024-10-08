public class Heavy extends Vehicles{
    int pull;

    @Override
    public String toString() {
        return "Heavy{" +
                "pull=" + pull +
                '}';
    }

    public int getPull() {
        return pull;
    }

    public void setPull(int pull) {
        this.pull = pull;
    }
    @Override
    public double exhaust(){
        return (pollution+500)*60*24;
    }
}
