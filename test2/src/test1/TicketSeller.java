package test1;

public class TicketSeller implements Runnable {

    private Integer ticket = 1000;

    @Override
    public void run() {

            while (true) {
                synchronized(TicketSeller.class){
                if (ticket<=0) {
                    break;
                }

                System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                ticket--;
            }
        }

    }
}
