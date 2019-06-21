package task;

public class SendEmailTask implements Task<String> {

    @Override
    public boolean run(String email) {
        System.out.println("Sending an email to " + email);
        return true;
    }
}
