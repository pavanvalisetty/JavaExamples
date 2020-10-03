package ExecutorsExamples;

import java.util.concurrent.Executors;    
import java.util.concurrent.ThreadFactory;    
    
public class ExecutorprivilegedThreadFactoryExample1_1  {    
     
    public static void main(String[] args) {    
        ThreadFactory thrdfctry = Executors.defaultThreadFactory();    
        Thread t = thrdfctry.newThread(new Mythrd3());    
        t.start();  
        t.stop();
    }     
}    
    
class Mythrd3 implements Runnable {    
     
    @Override    
    public void run() {    
        System.out.println("Running thread concurrently");    
    }    
}  
