package p08_09_2023;

public class SlackMessage2 {

    String message;

    String fullName;

    String dateTime;

    String dateUpdate;

    public void printUserInfo() {

        System.out.println(this.fullName + " - " + this.dateTime);
        System.out.println(this.message);
    }
    public void textUpdate (String newText, String dateUpdate) {
            this.message = newText;
            this.dateTime = dateUpdate;

    }
}
