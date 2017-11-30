package quoters;

/**
 * Created by HP on 30.11.2017.
 */
public class TerminatorQuoter implements Quoter {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void sayQuote() {
        System.out.println("message = " + message);
    }
}
