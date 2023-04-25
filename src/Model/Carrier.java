package Model;

public class Carrier extends Boats{



    public Carrier(int capacity)
    {
        super(capacity);
    }

    @Override
    public String toString() {
        return  super.toString()+ "Carrier{} " + "passengers = " + getCapacity() + "planes }";
    }
}
