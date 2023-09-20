package d18_09_2023.Zadatak1;

public class QualityOptimizerControl extends Control {

//Kreirati klasu QualityOptimizerControl koja nasledjuje klasu Control i
//ima brzinu interneta u megabajtima, npr 10mb/s, 20mb/s, 7.9mb/s
//gettere, settere i konstruktore
//implementira metodu izvrsi akciju tako sto postavlja kvalitet videa u zavisnosti od brzine interneta. Kvalitet se racuna na osnovu formule:
//brzina interneta * 10.1, gde se uzima prvi veci kvalitet
//npr: ako je brizna interneta 20 * 10.1 = 204 => postavlja 240
//npr: ako je brzina interneta 5 * 10.1 = 50.5 => postavlja 144
//npr: ako je brzina interneta 50 * 10.1 = 505 => postavlja 720

    private double brzinaNeta;

    public QualityOptimizerControl() {
    }

    public QualityOptimizerControl(double brzinaNeta) {
        this.brzinaNeta = brzinaNeta;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        if (this.brzinaNeta * 10.1 < 144) {
            videoPlayer.setKvalitet(144);
        } else if (this.brzinaNeta * 10.1 < 240) {
            videoPlayer.setKvalitet(240);
        } else if (this.brzinaNeta * 10.1 < 360) {
            videoPlayer.setKvalitet(360);
        } else if (this.brzinaNeta * 10.1 < 480) {
            videoPlayer.setKvalitet(480);
        } else if (this.brzinaNeta * 10.1 < 720) {
            videoPlayer.setKvalitet(720);
        } else {
            videoPlayer.setKvalitet(1080);
        } if (this.brzinaNeta < 0) {
            videoPlayer.setKvalitet(0);
        }
    }
}
