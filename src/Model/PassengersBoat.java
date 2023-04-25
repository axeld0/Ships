package Model;

public class PassengersBoat extends Boats{


    public PassengersBoat(int capacity)
    {
       super(capacity);
    }

    @Override
    public String toString() {
        return   super.toString()+
                "PassengersBoat{" +
                "passengers=" + getCapacity() + " people" +
                "} ";
    }


}
