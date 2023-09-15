package v14_09_2023;

public class InstagramTag {

    private int x;
    private int y;
    private InstagramUser tagged;

    public InstagramTag(int x, int y, InstagramUser tagged) {
        this.x = x;
        this.y = y;
        this.tagged = tagged;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public InstagramUser getTagged() {
        return tagged;
    }
}
