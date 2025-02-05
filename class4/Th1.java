public class Th1 {
    public static void main(String[] ar) {
        Thread t = new Thread(); // Thread class object [thread-0 , 5, main]
        // System.out.println(t);
        // System.out.println(t.getName());
        System.out.println(Thread.currentThread().getName());
        // change the name of the thread to "MyThread"
        // t.setName("MyThread");
        // System.out.println(t.getName());
        //  only one thread is running in the program
        // System.out.println(Thread.currentThread().isAlive());
        // System.out.println(t.isAlive()); 
        
    }

}
