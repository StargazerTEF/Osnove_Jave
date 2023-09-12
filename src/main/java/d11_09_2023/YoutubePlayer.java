package d11_09_2023;

public class YoutubePlayer {
    private Video video;
    private int quality;
    private String regime;
    private int sound;
    private int time;

    public YoutubePlayer () {
        this.quality = 144;
        this.regime = "miniMode";
        this.sound = 75;
    }
    public void loadVideo (Video video) {
        this.video = video;
    }
    public void increaseSound () {
        this.sound += 10;
        if (this.sound > 100) {
            this.sound = 100;
        }
    }
    public void decreaseSound () {
        this.sound -= 10;
        if (this.sound < 0) {
            this.sound = 0;
        }
    }
    public void setQuality (int netSpeed) {
        if (netSpeed < 2) {
            this.quality = 144;
        } else if (netSpeed < 4) {
            this.quality = 240;
        } else if (netSpeed < 6) {
            this.quality = 360;
        } else if (netSpeed < 8) {
            this.quality = 720;
        } else {
            this.quality = 1080;
        }
    }
    public void activateMiniMode () {
        this.regime = "miniMode";
    }
    public void activateCinemaMode () {
        this.regime = "cinemaMode";
    }
    public void activateFullScreenMode () {
        this.regime = "fullScreenMode";
    }
    public void rewindForward () {
        this.time += 10;
        if (this.time > video.getDuration()) {
            this.time = video.getDuration();
        }
    }
    public void rewindBackward () {
        this.time -= 10;
        if (this.time < 0) {
            this.time = 0;
        }
    }
    public void printSoundTiles () {
        if (this.sound > 0){
            System.out.print("<: ");
        } else {
            System.out.print("</");
        }
        for (int i = 0; i < sound / 10; i++) {
            System.out.print("|");
        }
    }
    public void printRegimeStyle () {
        if (this.regime.equals("miniMode")) {
            System.out.println("[ ]");
        } else if (this.regime.equals("cinemaMode")) {
            System.out.println("[...]");
        } else if (this.regime.equals("fullScreenMode")) {
            System.out.println("[||||]");
        }
    }
    public void printTimeAt () {
        int minutesTime = this.time / 60;
        int secondsTime = this.time % 60;
        if (secondsTime < 10) {
            System.out.print(minutesTime + ":0" + secondsTime);
        } else {
            System.out.print(minutesTime + ":" + secondsTime);
        }
        System.out.print(" / ");
        int minutesDuration = this.video.getDuration() / 60;
        int secondsDuration = this.video.getDuration() % 60;
        if (secondsDuration < 10) {
            System.out.print(minutesDuration + ":0" + secondsDuration);
        } else {
            System.out.print(minutesDuration + ":" + secondsDuration);
        }
    }
    public void printTimeLine () {
        System.out.print("Timeline: ");
        for (int i = 0; i < 100; i++) {
           if (i < this.time * 100 / video.getDuration()) {
               System.out.print("*");
           } else {
               System.out.print(".");
           }
        }
    }
    public String videoShare () {
        String videoLink = "";
        videoLink = "https://youtu.be/" + this.video.getId();
        return videoLink;
    }
    public void readInfo () {
        this.printTimeAt();
        System.out.print(" Zvuk ");
        this.printSoundTiles();
        System.out.println();
        this.printTimeLine();
        System.out.println();
        System.out.println("Kvalitet: " + this.quality + "p");
        System.out.print("Rezim: ");
        this.printRegimeStyle();
        if (this.video != null) {
            System.out.println(this.video.getTittle());
            System.out.println("Likes " + this.video.getLikes() + " | Dislikes " + this.video.getDislikes());
            System.out.println(this.video.getViews() + " Pregleda");
            System.out.println(this.videoShare());
        }
    }

    public Video getVideo() {
        return video;
    }

    public int getQuality() {
        return quality;
    }

    public int getSound() {
        return sound;
    }

    public String getRegime() {
        return regime;
    }

    public int getTime() {
        return time;
    }

}
