public class HighResPrntDrvr extends PrintDriver{
    public HighResPrntDrvr(){
        res="High";
    }

    @Override
    void print() {
        System.out.println("Printed in High Resolution Mode");
    }
}
