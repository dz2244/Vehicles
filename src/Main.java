//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static double exhaustSum(Vehicles [] cars){
        double sum = 0;
        for(Vehicles i : cars){
            sum+= i.exhaust();
        }
        return sum;
    }
    public static void noiseSum(Vehicles[] cars){
        for(Vehicles i : cars) {
            if (i instanceof Regular) {
                ((Regular)i).noise();
            }
        }
    }
    public static void maxCharge(Vehicles[] a){
        int v = ((Cart) v).getChargeTime();
        for(Vehicles v: a){
            if(((Cart) v).getChargeTime() > ((Cart) v+1).getChargeTime()){
                return v.getLicense();
            }
        }
    }
    public int counterPassengers(Vehicles[] b){
        int num = 0;
        for(Vehicles v: b){
            if (v instanceof Bicycle){
                if (((Bicycle) v).isSalsela())
                    num++;
            }
            else if (v instanceof Regular){
                num += 4;
            }
        }
        return(num);
    }

    public static void main(String[] args) {

    }
}