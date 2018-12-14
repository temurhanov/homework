package Practise;

public  class Car {
    private int price;
    private String model;
    private int speed;
    private int length;

    public Car() {

    }

    public Car(int price, String model, int sped, String wheel) {
        this.price = price;
        this.model = model;
        this.speed = speed;
        this.length = length;
    }

    public int getPrice() {return price;}

    public void setLength(int length) {this.length = length;}

   public int getSpeed() {return speed;}

   public void setSpeed(int speed) {this.speed = speed; }

   public void setModel() {this.model = model;}

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                ", length='" + length + '\'' +
                '}';
    }





}
