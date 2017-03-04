package beans;

public abstract class Factory {

    public String name;
    public double cost;

    public Factory(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public abstract double getDoubleCost();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Factory factory = (Factory) o;

        if (Double.compare(factory.cost, cost) != 0) return false;
        return name.equals(factory.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(cost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "beans.Factory{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
