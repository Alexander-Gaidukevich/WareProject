package beans;

public class Jacket extends Factory {

    public final static String material = "Synthetic";
    public double cost = 200;

    public Jacket(String name, double cost) {
        super(name, cost);
    }

    @Override
    public double getDoubleCost() {
        return cost - (cost * 0.2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Jacket jacket = (Jacket) o;

        return Double.compare(jacket.cost, cost) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(cost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "beans.Jacket{" +
                "cost=" + cost +
                '}';
    }
}
