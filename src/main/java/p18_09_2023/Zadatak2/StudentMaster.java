package p18_09_2023.Zadatak2;

public class StudentMaster extends Student {

    @Override
    public double cenaSkolarine () {
        return 100000;
    }

    @Override
    public boolean daLiJeNaBudzetu () {
        if (this.godStudija < 2) {
            return true;
        }
        return false;
    }
    public void print () {
        super.print();
    }
}
