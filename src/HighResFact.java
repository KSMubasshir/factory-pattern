class HighResFact extends ResFactory {

    @Override
    public PrintDriver getPrintDriver() {
        return new HighResPrntDrvr();
    }

    @Override
    public DisplayDriver getDispDrvr() {
        return new HighResDispDrvr();
    }
}
