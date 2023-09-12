package p12_09_2023;

public class Korisnik {
    private String fullName;
    private String licence;

    public Korisnik () {
        this.licence = "basic";
    }
    public void payLicence (int sum) {
        if (sum == 100) {
            this.licence = "pro";
        } else if (sum >= 150) {
            this.licence = "premium";
        }
    }
    public void denyLicence () {
        this.licence = "basic";
    }
    public int maxCallLength () {
        int maxCallLength = 0;
        if (this.licence.equals("basic")) {
            maxCallLength = 40;
        } else if (this.licence.equals("pro")) {
            maxCallLength = 240;
        } else if (this.licence.equals("premium")) {
            maxCallLength = 240;
        }
        return maxCallLength;
    }
    public void print () {
        System.out.println(this.fullName);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLicence() {
        return licence;
    }
}
