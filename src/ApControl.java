public class ApControl {
    
    //ResFactory fact=new HighResFact();
    ResFactory fact=new LowResFact();
    private DisplayDriver myDisplayDriver=fact.getDispDrvr();
    private PrintDriver myPrintDriver=fact.getPrintDriver();
    
    
    void Draw(){
        myDisplayDriver.draw();
    }
    
    void print(){
        myPrintDriver.print();
    }
}
