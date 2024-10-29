public class kibbuch extends Vehicles{
    Vehicles [] arr = new Vehicles[500];
    int counterCars;

    public Vehicles[] getArr() {
        return arr;
    }

    public void setArr(Vehicles[] arr) {
        this.arr = arr;
    }

    public int getCounterCars() {
        return counterCars;
    }

    public void setCounterCars(int counterCars) {
        this.counterCars = counterCars;
    }

    public kibbuch(Vehicles[] arr, int counterCars) {
        this.arr = arr;
        this.counterCars = counterCars;
    }

    public void addCar(Vehicles car){
        if(counterCars < 500) {
            arr[counterCars] = car;
            counterCars++;
        }
    }
    public Vehicles [] bigAgeWithWheel(Vehicles [] arr){

        int counter;
        for(int i = 0; i<arr.length; i++){
            if(arr[i].wheelSteering && arr[i].getAge() > 15){
                counter++;
            }
        }
        if(counter > 0)
        {
            Vehicles [] newArr = new  Vehicles[counter];
            for(int i = 0; i < count; i++)
            {
                int count1 = 0;
                if(a[i].isWheelSteering() && a[i].getAge() > 15)
                {
                    newlist[count1] = a[i];
                    count1++;
                }
            }
        }
        return arr;
    }
}
