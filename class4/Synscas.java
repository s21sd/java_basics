public class Synscas extends Thread {
    Synscas() {
        start();
    }

    public void run() {
        System.out.print("child Thread Started");
        try {
            for (int i = 1; i <= 50; i++) {
                System.out.println("Thread: " + i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.print(e);
        }
        System.out.print("child Thread Ended");
    }

    public static void main(String[] ar) {
        System.out.print("Main Thread Started");
        Synscas s1 = new Synscas();
        try {
            s1.join();
        } catch (Exception e) {
            System.out.print(e);

        }
        System.out.print("Main Thread Ended");
    }

}
