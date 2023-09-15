package v14_09_2023;

import java.util.ArrayList;

public class InstagramImage {
    private ArrayList<InstagramTag> tags;
    private int picLength;
    private int picHeight;
    private String http;

    public InstagramImage() {
        this.tags = new ArrayList<>();
    }

    public InstagramImage(int picLength, int picHeight, String http) {
        this.picLength = picLength;
        this.picHeight = picHeight;
        this.http = http;
        this.tags = new ArrayList<>();
    }

    public void addTag (InstagramTag newTag) {
        this.tags.add(newTag);
    }

    public void print () {
        System.out.println("Slika je dimenzija " + this.picHeight + " x " + this.picLength);
        System.out.println("http: " + this.http);
        System.out.println("Tagovani korisnici: ");
        for (int i = 0; i < this.tags.size(); i++) {
            this.tags.get(i).getTagged().print();
        }
    }
    public ArrayList<InstagramTag> getTags() {
        return tags;
    }

    public int getPicLength() {
        return picLength;
    }

    public int getPicHeight() {
        return picHeight;
    }

    public String getHttp() {
        return http;
    }
}
