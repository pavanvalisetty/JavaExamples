package ExecutorsExamples;
import java.util.ArrayList;    
import java.util.Date;    
import java.util.List;    
import java.util.concurrent.Callable;    
import java.util.concurrent.ExecutionException;    
import java.util.concurrent.ExecutorService;    
import java.util.concurrent.Executors;    
import java.util.concurrent.Future;    
    
public class ExecutorCallableExample1 implements Callable<String> {    
    
    @Override    
    public String call() throws Exception {    
        Thread.sleep(1000);    
        return Thread.currentThread().getName();    
    }    
        
    public static void main(String args[]){    
    
        ExecutorService executor = Executors.newFixedThreadPool(20);    
        List<Future<String>> list = new ArrayList<Future<String>>();    
        Callable<String> callable = new ExecutorCallableExample1();    
    
        for(int i=0; i< 10; i++){    
            Future<String> ftr = executor.submit(callable);    
            list.add(ftr);    
        }    
        for(Future<String> fut : list){    
            try {    
                System.out.println(new Date()+ "::"+fut.get());    
    
            } catch (InterruptedException | ExecutionException e) {    
                e.printStackTrace();    
            }    
        }    
        executor.shutdown();    
    }    
    
}   