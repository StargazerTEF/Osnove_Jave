package d18_09_2023.Zadatak1;

public class AudioControl extends Control {

//Kreirati klasu AudioControl koja nasledjuje klasu Control i
//gettere, settere i konstruktore
//ima atribut koji kaze da li se smanjuje ili pojacava zvuk (tipa boolean)
//implementira metodu izvrsi akciju tako sto pojaca ili smanjuje zvuk za 1. U opsegu od 0 do 100

    private boolean pojacavanje;

    public AudioControl() {
    }

    public AudioControl(boolean pojacavanje) {
        this.pojacavanje = pojacavanje;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        if (this.pojacavanje) {
            videoPlayer.setZvuk(videoPlayer.getZvuk() + 1);
            if (videoPlayer.getZvuk() + 1 > 100) {
                videoPlayer.setZvuk(100);
            }
        } else {
            videoPlayer.setZvuk(videoPlayer.getZvuk() - 1);
            if (videoPlayer.getZvuk() - 1 < 0) {
                videoPlayer.setZvuk(0);
            }
        }
    }

    public boolean isPojacavanje() {
        return pojacavanje;
    }

    public void setPojacavanje(boolean pojacavanje) {
        this.pojacavanje = pojacavanje;
    }
}
