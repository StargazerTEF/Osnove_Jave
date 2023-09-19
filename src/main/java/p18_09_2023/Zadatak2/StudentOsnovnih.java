package p18_09_2023.Zadatak2;

public class StudentOsnovnih extends Student {

    @Override
    public double cenaSkolarine () {
        return 90000;
    }

    @Override
    public boolean daLiJeNaBudzetu () {
        if (this.godStudija < 5) {
            return true;
        }
        return false;
    }

    public void print () {
        super.print();
    }
}
