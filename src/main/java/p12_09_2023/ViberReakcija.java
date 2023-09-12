package p12_09_2023;

public class ViberReakcija {
    private String emoji;
    private ViberKorisnik reacted;

    public ViberReakcija(String emoji, ViberKorisnik reacted) {
        this.emoji = emoji;
        this.reacted = reacted;
    }

    public String getEmoji() {
        return emoji;
    }

    public ViberKorisnik getReacted() {
        return reacted;
    }
}

