public class HighResDispDrvr extends DisplayDriver{
    public HighResDispDrvr(){
        res="HIgh";
    }

    @Override
    void draw() {
        System.out.println("Drew in High Resolution");
    }
}
