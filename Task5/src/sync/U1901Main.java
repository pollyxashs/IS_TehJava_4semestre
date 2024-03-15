package sync;

public class U1901Main {
    U1901Bank bankMain;
    U1901Thread threadOne;

    public static void main(String[] args) {
        U1901Bank bankMain = new U1901Bank(0, 220);
        U1901Thread threadOne = new U1901Thread(bankMain, 100,2000);
        threadOne.setName("threadOne");
        threadOne.setPriority(Thread.MIN_PRIORITY);
        threadOne.start();

        U1901Thread threadTwo = new U1901Thread(bankMain, 50, 300);
        threadTwo.setName("threadTwo");
        threadTwo.setPriority(Thread.MAX_PRIORITY);
        threadTwo.start();
        System.out.println(Thread.currentThread().getName());
    }
}