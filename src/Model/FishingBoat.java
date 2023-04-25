package Model;

public class FishingBoat extends  Boats{
    private String name ;
    private  double power;

    public FishingBoat()
    {
        name = "";
        power = 0;
    }
    public FishingBoat(int capacity , String name , double power)
    {
        super(capacity);
        this.name = name;
        this.power = power;
    }


    @Override
    public String toString() {
        return  super.toString()+
                "FishingBoat{" +
                "Name='" + name + '\''+
                ", Fisherman capacity =" + getCapacity()+
                ", power=" + power +
                "} ";
    }
}
