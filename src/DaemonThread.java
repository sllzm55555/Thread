import java.util.Date;

public class DaemonThread implements Runnable {
    @Override
    public void run() {
        Date date = new Date();
        while (true){
            System.out.println("守护式线程" + date);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
