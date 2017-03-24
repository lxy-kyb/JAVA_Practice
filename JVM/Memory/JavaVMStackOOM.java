import java.lang.Thread;
import java.lang.Runnable;
/**
 * JavaVMStackOOM
 * VM Args : -Xss2m
 */
public class JavaVMStackOOM {
    public void dontStop() {
        while(true) {          
        }
    }

    public void stackLeakByThread() {
        while(true) {
             Thread thread = new Thread(new Runnable(){
                @Override
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }   
    }

    public static void main(String[] args) {
        JavaVMStackOOM oom = new JavaVMStackOOM();
        oom.stackLeakByThread();
    }

}