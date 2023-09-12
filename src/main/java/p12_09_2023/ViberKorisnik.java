package p12_09_2023;

public class ViberKorisnik {
    private String fullName;
    private String phoneNumber;
    private boolean isActive;

    public ViberKorisnik (String fullName, String phoneNumber, boolean isActive) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.isActive = isActive;
    }

    public String getFullName() {
        return fullName;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
