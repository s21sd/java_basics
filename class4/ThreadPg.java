
public class ThreadPg extends Thread {
    ThreadPg() {
        start();
    }

    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }

    public static void main(String[] ar) {
        new ThreadPg();
        try {
            for (int i = 101; i <= 110; i++) {
                System.out.println("Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }
}
