package ExecutorsExamples;

import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;  
import java.util.concurrent.ScheduledExecutorService;  
import java.util.concurrent.ThreadFactory;  
import java.util.concurrent.ThreadPoolExecutor;  
import java.util.concurrent.TimeUnit;  
  
public class ExecutorsnewSheduledThreadPoollExample1  {  
      
   public static void main(final String[] arguments) throws InterruptedException {  
         
    ScheduledExecutorService scheduler = Executors.newScheduledThreadPool( 3 );  
       ThreadFactory ThreadFactory = Executors.defaultThreadFactory();  
        System.out.println(scheduler.getClass());  
      ExecutorService excr = Executors.newCachedThreadPool(ThreadFactory);  
      ThreadPoolExecutor mypool = (ThreadPoolExecutor) excr;  
      System.out.println("size of mypool: " + mypool.getPoolSize());  
      
      excr.submit(new Threadimpl());  
        
      excr.shutdown();  
   }    
  
   static class Threadimpl implements Runnable {  
  
      public void run() {  
           
         try {  
            Long num = (long) (Math.random() / 30);  
            System.out.println("Thread Name: " +Thread.currentThread().getName());  
               TimeUnit.SECONDS.sleep(num);  
            System.out.println("after sleep Thread Name: " +Thread.currentThread().getName());  
         } catch (InterruptedException e) {  
            e.printStackTrace();  
         }  
      }  
   }  
}  