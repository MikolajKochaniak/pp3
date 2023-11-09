public class InternetDeviceTest {
    public static void main(String[] args) {
        InternetDevice tablet = new InternetDevice("tablet");
        InternetDevice pc = new InternetDevice("pc");
        InternetDevice tv = new InternetDevice("tv");
        InternetDevice ipad = new InternetDevice("ipad");
        InternetDevice ipod = new InternetDevice("ipod");
        tablet.connect();
        ipad.connect();
        ipod.connect();
        System.out.println(pc.isConected());
        System.out.println(tv);



    }
}
