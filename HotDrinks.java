public class HotDrinks extends Product {
    private int temp;
    private double volume;

    public HotDrinks(String name, double cost, int temp, double volume) {
        super(name, cost);
        this.temp = temp;
        this.volume = volume;
    }

    public int getTemp() {
        return temp;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Hot Drinks {" +
                "name='" + name + '\'' +
                ", cost=" + cost + '\'' +
                ", temp=" + temp + '\'' +
                ", temp=" + volume +
                '}';
    }
}
