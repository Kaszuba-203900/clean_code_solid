package pl.ttpsc.solid.isp.contactbook.solution;

public interface EmailCommunication {

    void sendEmail(String targetEmail, String subject, String body);
}
