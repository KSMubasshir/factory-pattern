public class LowResDispDrvr extends DisplayDriver{
    public LowResDispDrvr(){
        res="Low";
    }

    @Override
    void draw() {
        System.out.println("Drew in Low Resolution Mode");
    }
}
