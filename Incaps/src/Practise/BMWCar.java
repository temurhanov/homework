package Practise;

public class BMWCar extends Car  {
    private String wheel;

    public BMWCar(int price, int speed, String model, int length, String wheel){
        this.wheel = wheel;
    }
        public String getWheel() {return wheel;}

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }


}
