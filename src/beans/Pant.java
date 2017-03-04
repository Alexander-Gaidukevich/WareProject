package beans;

public class Pant extends Factory {

    public final static String material = "Cotton";
    public double cost = 100;

    public Pant(String name, double cost) {
        super(name, cost);
    }

    @Override
    public double getDoubleCost() {
        return cost - (cost * 0.1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Pant pant = (Pant) o;

        return Double.compare(pant.cost, cost) == 0;
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
        return "beans.Pant{" +
                "cost=" + cost +
                '}';
    }
}
