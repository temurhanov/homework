package Practise;

public class Tesla extends Car {
    private int capacity;

    public Tesla(String model, int price, int speed, int length, int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int expacity) {
        this.capacity = expacity;
    }

    @Override
    public String toString() {
        return "Tesla{" + "capacity=" + capacity +
                '}';
    }

    public Tesla(int price, String model, int speed, String wheel) {
        super(price, model, speed, wheel);
    }
}
