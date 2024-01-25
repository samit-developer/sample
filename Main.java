

public class Main{
    public static void main(String[] args) throws InterruptedException{

          /*Multi-Threading = process of executing  multiple threads simultaneously
                              Helps maximum utilization of CPU
                              Thread are independent  , they don't affect the execution  of other threads.
                              an exception in one thread will not interrupt other thread will not interrupt other threads.
                              Useful for serving multiple clients , multiplayer games , or other mutually independent
          * */

        //create subclass of thread
        Mythread thread1 = new Mythread();
        //or

        // implement runnable interface and pass instance as an argument to thread
        MyRunnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);

        thread1.setDaemon(true);
        thread2.setDaemon(true);

        thread1.start();
        //thread1.join(3000); // calling thread (e.g- main) waits until specified thread dies.
        thread2.start();

        //System.out.println(1/0);



    }
}