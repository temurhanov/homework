package Task;

public class phone {
    private int price;
    private String model;
    private int length;

    public phone(){

    }

    public phone(int price, String model, int length) {
        this.price = price;
        this.model = model;
        this.length = length;
    }

    public int getPrice() {return price;}

    public void setLength(int length) {this.length = length;}

    public void setModel() {this.model = model;}

    @Override
    public String toString() {
        return "phone{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", length=" + length +
                '}';
    }
}
