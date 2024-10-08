public class Truck extends Heavy{
    double maxWeight;

    @Override
    public String toString() {
        return "Truck{" +
                "maxWeight=" + maxWeight +
                '}';
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }
    @Override
    public double exhaust(){
        return super.exhaust() *1.5;
    }
}
