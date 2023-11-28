public class Processor {
    private String model;
    private float speedInGhz;
    private String socket;
    private String brand;

    
    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }


    public float getSpeedInGhz() {
        return speedInGhz;
    }


    public void setSpeedInGhz(float speedInGhz) {
        this.speedInGhz = speedInGhz;
    }


    public String getSocket() {
        return socket;
    }


    public void setSocket(String socket) {
        this.socket = socket;
    }


    public String getBrand() {
        return brand;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }


    public int Calculate(int x, int y){
        return x+y;
    }
}