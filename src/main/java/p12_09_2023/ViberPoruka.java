package p12_09_2023;

public class ViberPoruka {
    private String text;
    private String time;
    private ViberKorisnik sender;
    private ViberKorisnik receiver;
    private ViberReakcija reaction;

    public ViberPoruka (String text, String time, ViberKorisnik sender, ViberKorisnik receiver, ViberReakcija reaction) {
        this.text = text;
        this.time = time;
        this.sender = sender;
        this.receiver = receiver;
        this.reaction = reaction;
    }

    public void printInfo() {
        String aktivnost = "";
        if (this.getSender().getIsActive()) {
            aktivnost = " * Active Now";
        } else {
            aktivnost = " Not Active;";
        }
        System.out.println("From: " + this.sender.getFullName() + aktivnost + " - at " + this.time);
        System.out.println("To: " + this.receiver.getFullName());
        System.out.println(this.text + " : " + this.reaction.getEmoji() + " from " + this.reaction.getReacted().getFullName());
    }

    public String getText() {
        return text;
    }

    public ViberKorisnik getReceiver() {
        return receiver;
    }

    public ViberKorisnik getSender() {
        return sender;
    }

    public ViberReakcija getReaction() {
        return reaction;
    }

    public String getTime() {
        return time;
    }
}
