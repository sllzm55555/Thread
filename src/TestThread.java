public class TestThread {
    public static void main(String[] args) {
        NormalThread normalThread = new NormalThread();
        NormalThread normalThread2 = new NormalThread();

        DaemonThread daemonThread = new DaemonThread();

        normalThread.run();
        normalThread2.run();
        Thread thread = new Thread(daemonThread);
        thread.setDaemon(true);
        thread.run();

    }



}
