package d11_09_2023;

public class Video {

    private String id;
    private String tittle;
    private int duration;
    private int likes;
    private int dislikes;
    private int views;

    public Video (String id, String tittle, int duration, int likes, int dislikes, int views) {
        this.id = id;
        this.tittle = tittle;
        this.duration = duration;
        this.likes = likes;
        this.dislikes = dislikes;
        this.views = views;
    }
    public void like () {
        this.likes++;
    }
    public void dislike () {
        this.dislikes++;
    }
    public void view () {
        this.views++;
    }

    public String getId() {
        return id;
    }

    public String getTittle() {
        return tittle;
    }

    public int getDuration() {
        return duration;
    }

    public int getLikes() {
        return likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public int getViews() {
        return views;
    }
}
