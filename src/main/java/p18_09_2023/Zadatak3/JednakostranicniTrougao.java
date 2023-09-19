package p18_09_2023.Zadatak3;

public class JednakostranicniTrougao extends Figura {

    public JednakostranicniTrougao(double a) {
        this.a = a;
    }

    private double a;

    @Override
    public double povrsina () {
        return this.a * this.a * 1.73205;
    }

    @Override
    public double obim () {
        return 3 * this.a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
}
