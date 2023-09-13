package W3.D3;

public interface Ectothermic {
    // Just for reference, this is an interface, the methods declared inside here are PUBLIC and ABSTRACT by default
    // Any fields listed in here will be PUBLIC, STATIC, and FINAL by default
    public static final int minBodyTemp = -40;
    int maxBodyTemp = 90;

    // Methods are declared as PUBLIC and ABSTRACT
    public abstract void heatUp();
    void coolDown();
}
