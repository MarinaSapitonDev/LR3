import java.util.Objects;

public class Premium extends Auto{
    private int capacity;

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }



    public Premium() {
    }

    public Premium(String model, String age, String price, int capacity) {
        super(model, age, price);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Premium{" + "capacity='" + capacity + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Premium premium = (Premium) o;
        return Objects.equals(capacity, premium.capacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), capacity);
    }
}
