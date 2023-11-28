public class Computer{
    private Processor processor;
    private int storage;
    private int RAM;
    private String brand;
    private int computerID;
    private boolean isOn;


    public Computer() {
        processor = new Processor();

    }

    public Processor getProcessor() {
        return processor;
    }
    public void setProcessor(Processor processor) {
        this.processor = processor;
    }
    public int getStorage() {
        return storage;
    }
    public void setStorage(int storage) {
        this.storage = storage;
    }
    public int getRAM() {
        return RAM;
    }
    public void setRAM(int rAM) {
        RAM = rAM;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getComputerID() {
        return computerID;
    }
    public void setComputerID(int computerID) {
        this.computerID = computerID;
    }
    public void start(){
        isOn = true;
    }
    public void shutDown(){
        isOn = false;
    }
    


    
}