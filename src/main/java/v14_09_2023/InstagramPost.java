package v14_09_2023;

import java.util.ArrayList;

public class InstagramPost {
    private ArrayList<InstagramImage> images;
    private String opis;

    public InstagramPost(String opis) {
        this.opis = opis;
        this.images = new ArrayList<>();
    }

    public void addPic (InstagramImage newImage) {
        this.images.add(newImage);
    }

    public void print () {
        for (int i = 0; i < this.images.size(); i++) {
            this.images.get(i).print();
        }
        System.out.println("Opis: " + this.opis);
    }

    public ArrayList<InstagramImage> getImages() {
        return images;
    }

    public String getOpis() {
        return opis;
    }
}
