package test1;

public class TicketTest {
    public static void main(String[] args) {

        TicketSeller ticketSeller = new TicketSeller();
        new Thread(ticketSeller,"1号窗口").start();
        new Thread(ticketSeller,"2号窗口").start();
        new Thread(ticketSeller,"3号窗口").start();
        new Thread(ticketSeller,"4号窗口").start();
    }

}
