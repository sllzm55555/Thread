import java.util.Date;

public class NormalThread extends Thread {

    @Override
    public void run() {
        Date date = new Date();
        for (int i = 0; i < 10; i++) {
            System.out.println("普通线程运行" + date);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
