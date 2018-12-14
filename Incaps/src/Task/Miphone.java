package Task;

public class Miphone extends phone  {
    private int capacity;

    public Miphone( int price,String model,int length){
        super(price,model,length);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }



}
