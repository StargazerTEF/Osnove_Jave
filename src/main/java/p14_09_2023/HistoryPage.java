package p14_09_2023;

public class HistoryPage {

    private String nazivStranice;
    private String link;
    private int timeHour;
    private int timeMin;
    private String username;
    private String password;

    public HistoryPage() {

    }

    public HistoryPage(String nazivStranice, String link, int timeHour, int timeMin) {
        this.nazivStranice = nazivStranice;
        this.link = link;
        this.timeHour = timeHour;
        this.timeMin = timeMin;
    }

    public void sacuvajKredencijale (String username, String password) {
        this.username = username;
        this.password = password;
    }
    public void obrisiKolacice () {
        this.username = null;
        this.password = null;
    }

    public void print () {
        if (this.username != null && this.password != null) {
            System.out.println(this.timeHour + " - " + this.timeMin + " - " + this.nazivStranice + "..." + this.link + " * ");
        } else {
            System.out.println(this.timeHour + " - " + this.timeMin + " - " + this.nazivStranice + "..." + this.link);
        }
    }
    public String getNazivStranice() {
        return nazivStranice;
    }

    public void setNazivStranice(String nazivStranice) {
        this.nazivStranice = nazivStranice;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getTimeHour() {
        return timeHour;
    }

    public void setTimeHour(int timeHour) {
        this.timeHour = timeHour;
    }

    public int getTimeMin() {
        return timeMin;
    }

    public void setTimeMin(int timeMin) {
        this.timeMin = timeMin;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
