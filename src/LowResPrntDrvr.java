public class LowResPrntDrvr extends PrintDriver{
    public LowResPrntDrvr(){
        res="low";
    }

    @Override
    void print() {
        System.out.println("Printed In Low Res Mode");
    }
}
