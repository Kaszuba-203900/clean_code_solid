package pl.ttpsc.solid.isp.contactbook.solution;

public class Contact implements EmailCommunication, PhoneCommunication {

    private String name;
    private String surname;
    private String telephone;
    private String email;

    public Contact(String name, String surname, String telephone, String email) {
        this.name = name;
        this.surname = surname;
        this.telephone = telephone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void sendEmail(String targetEmail, String subject, String body) {

    }

    @Override
    public void makeCall(String targetPhoneNumber) {

    }
}
