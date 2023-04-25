import Model.Boats;
import Model.Carrier;
import Model.FishingBoat;
import Model.PassengersBoat;

public class Main {
    public static void main(String[] args) {

        Boats b1 = new Carrier(12);
        Boats b2 = new FishingBoat(324, "La tia Marta", 23);
        Boats b3 = new PassengersBoat(344);

        System.out.println(b1.alarm());
        System.out.println(b2.SOS());
        System.out.println(b3);
        System.out.println(b2);
    }
}