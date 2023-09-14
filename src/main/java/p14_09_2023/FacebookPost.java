package p14_09_2023;

import java.util.ArrayList;

public class FacebookPost {
    private String imePrezime;
    private String text;
    private ArrayList<Reakcija> reakcije;

    public FacebookPost() {
        this.reakcije = new ArrayList<>();
    }

    public FacebookPost(String imePrezime, String text) {
        this.imePrezime = imePrezime;
        this.text = text;
        this.reakcije = new ArrayList<>();
    }
    public void reaguj (Reakcija newReakcija) {
        this.reakcije.add(newReakcija);
    }
    private int brojReakcija (String tip) {
       int counter = 0;
        for (Reakcija reakcija : this.reakcije) {
            if (reakcija.getTip().equals(tip)) {
                counter++;
            }
        }
        return counter;
    }

    public void print () {
        System.out.println(this.imePrezime);
        System.out.println(this.text);
        System.out.println(this.brojReakcija("smile") + " | " + this.brojReakcija("like") + " | " + this.brojReakcija("srce"));
    }

    public String getText() {
        return text;
    }

    public ArrayList<Reakcija> getReakcije() {
        return reakcije;
    }

    public String getImePrezime() {
        return imePrezime;
    }
}
