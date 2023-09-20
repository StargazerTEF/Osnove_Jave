package d18_09_2023.Zadatak1;

public class Zadatak1 {
    public static void main(String[] args) {

// U glavnom programu kreirati video plejer i izvrsiti neke akcije nad njim.

        VideoPlayer player = new VideoPlayer(240, 120, 3, 360);

        TimeControl tc1 = new TimeControl(true);
        AudioControl ac1 = new AudioControl(false);
        QualityOptimizerControl qoc1 = new QualityOptimizerControl(50);

        tc1.izvrsiAkciju(player);
        tc1.izvrsiAkciju(player);
        tc1.izvrsiAkciju(player);
        tc1.izvrsiAkciju(player);
        tc1.izvrsiAkciju(player);
        tc1.izvrsiAkciju(player);
        tc1.izvrsiAkciju(player);
        tc1.izvrsiAkciju(player);
        tc1.izvrsiAkciju(player);
        tc1.izvrsiAkciju(player);

        ac1.izvrsiAkciju(player);
        ac1.izvrsiAkciju(player);
        ac1.izvrsiAkciju(player);
        ac1.izvrsiAkciju(player);

        qoc1.izvrsiAkciju(player);

        player.print();

    }
}
