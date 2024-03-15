package sync;

public class U1901Bank {
    private int intTo;
    private static int intFrom = 220;

    public U1901Bank(int intTo, int intFrom){
        this.intTo = intTo;
        this.intFrom = intFrom;
    }



    public int getIntTo(){
        return intTo;
    }
    public void setIntTo(int intTo){
        this.intTo = intTo;
    }
    public int getIntFrom(){
        return intFrom;
    }
    public void setIntFrom(int intFrom){
        this.intFrom = intFrom;
    }

    public synchronized void calc(int intTransaction, long lngTimeout ){
        int beforeIntTo = intTo;
        int beforeIntFrom = intFrom;
        intFrom -= intTransaction;
        try {
            Thread.sleep(lngTimeout);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }
        intTo += intTransaction;
        System.out.println("Thread=" + Thread.currentThread().getName() +
                ", intTo before:" + beforeIntTo +
                ", From=" + beforeIntFrom +
                ", To=" + intTo +
                ", After intFrom=" + intFrom);
    }
}