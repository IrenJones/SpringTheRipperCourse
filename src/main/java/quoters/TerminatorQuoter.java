package quoters;

public class TerminatorQuoter implements Quoter {
    @InjectRandomInt (min = 2, max = 7)
    private int repeat;

    private String message;

    public TerminatorQuoter() {
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("message = " + message);
        }
    }
}
