//Create and Run a Thread using Runnable Interface and Thread class.
class SampleThread extends Thread{
    public void run() {
        System.out.println("Extends Thread..");
        for(int i=1; i<=3; i++){
            System.out.println("i = " + i);
        }
    }
}
class SampleThread2 implements Runnable{
    public void run() {
        System.out.println("Implements Runnable..");
        for(int i=1; i<=3; i++){
            System.out.println("i = " + i);
        }
    }
}
public class Question1{
    public static void main(String[] args) {
        
    
    SampleThread t1 = new SampleThread();
    System.out.println("Thread about to start..");

    SampleThread2 threadObject = new SampleThread2();
    Thread thread = new Thread(threadObject);
    System.out.println("Thread about to start..");
    t1.start();
    try{Thread.sleep(10);} catch(Exception e ){}
    thread.start();
    }


}