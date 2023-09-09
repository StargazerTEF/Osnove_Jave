package d08_09_2023;

public class FacebookPost {

    String fullNameUser1;
    String fullNameUser2;
    String text;
    int likes;
    int shares;

    public void likeCounter (boolean like) {
        if (like) {
            this.likes++;
        }
    }
    public void dislikeCounter (boolean dislike) {
        if (dislike) {
            this.likes--;
        } if (this.likes < 0) {
            this.likes = 0;
        }
    }
    public void shareCounter (boolean share) {
        if (share) {
            this.shares++;
        }
    }
    public void print () {
        System.out.println(fullNameUser1 + " >>> " + fullNameUser2);
        System.out.println(text);
        System.out.println("Likes " + this.likes + " | " + "Shares " + this.shares);
        System.out.println();
    }

}
