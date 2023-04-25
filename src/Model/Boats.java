package Model;

public abstract class Boats implements IAlarm{

    private int capacity;

    public Boats()
    {
        capacity = 0;
    }
    public Boats (int capacity)
    {
        this.capacity = capacity;
    }

    @Override
    public String SOS() {
        return "HELP. PLEASE, GOD, HELP.";
    }

    @Override
    public String alarm() {
        return "AAAAAAAAIIIUUUUUUUIIIIAAAAAAAA";
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Boat{" +
                '}';
    }
}
