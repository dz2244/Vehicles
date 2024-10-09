public class Cart extends Light{
    int chargeTime;

    @Override
    public String toString() {
        return "Cart{" +
                "chargeTime=" + chargeTime +
                '}';
    }

    public int getChargeTime() {
        return chargeTime;
    }

    public void setChargeTime(int chargeTime) {
        this.chargeTime = chargeTime;
    }
    @Override
    public double exhaust(){
        return (pollution+1000)*60;
    }
    public void hitchhikers(){
        System.out.println(2);
    }
}
