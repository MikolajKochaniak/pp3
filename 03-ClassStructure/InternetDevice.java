public class InternetDevice {
    String name;
    boolean connected;
    static int connectedDevices;
    static int dispalyConnections;
    public String toString(){
        return name + "\n" + connected + "\n" + connectedDevices; 
        
        }
    boolean isConected(){
        return connected;
    }
    void connect(){
            connected = true;
            connectedDevices++;
        }
    void disconnect(){
            connected = false;
            connectedDevices--;
        }
    InternetDevice(String name){
        this.name = name;
        

    }
}
