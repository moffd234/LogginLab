import java.util.logging.Level;
import java.util.logging.Logger;


// Finished
public class LogginLab {
    private final static Logger logger = Logger.getLogger(LogginLab.class.getName());

    private Integer threshold = 0;

    public LogginLab() {
        this.threshold = 0;
    }

    public static void main(String[] args) {

        logger.log(Level.INFO, "Hello World!");
        logger.log(Level.SEVERE, "Terrible Error!");
        logger.log(Level.WARNING, "Not So Bad Error!");

        logger.log(Level.INFO, "****\n\tAt ZipCode, \n\twe don't use System.out.Println \n\tuntil we've earned the right.\n****");

    }

    public Integer getThreshold() {
        return threshold;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    public boolean thresholdExceeds(Integer limit) {
        return thresholdReached(limit);
    }

    // Write a method called thresholdReached, returns true if argument 'limit' is over the threshold.
    public boolean thresholdReached(Integer limit){
        return this.threshold > limit;
    }
    // use thresholdExceeds for a pattern.

    // Write a test for the method in the Test class.

}
