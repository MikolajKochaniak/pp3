public class Lamp {
    boolean isOn;
    void switch_on()
    {
        isOn = true;
    }
    void switch_off()
    {
        isOn = false;
    }
    void info()
{
    if(isOn == true)
    {
        System.out.println("Lamp is on");
    }
    else
    {
        System.out.println("Lamp is off");
    }
}
}
