import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Kalle
 */
public class TimerTillOSRS {

    /**
     * @param args the command line arguments
     */
    int secounds = 0;
    Timer timer = new Timer();
    TimerTask task  = new TimerTask() {
        @Override
        public void run() {
            secounds++;
            System.out.println(secounds);
        }
    };
    public  void start(){
        timer.scheduleAtFixedRate(task,1000,1000);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        TimerTillOSRS timer = new TimerTillOSRS();
        timer.start();
        
    }
    
}
