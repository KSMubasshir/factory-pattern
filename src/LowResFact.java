
public class LowResFact extends ResFactory {
    
    @Override
    public DisplayDriver getDispDrvr() {
            return new LowResDispDrvr();
    }

    @Override
    public PrintDriver getPrintDriver() {
        return new LowResPrntDrvr();
    }
}
