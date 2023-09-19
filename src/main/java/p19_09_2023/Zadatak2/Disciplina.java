package p19_09_2023.Zadatak2;

import java.util.ArrayList;

public class Disciplina {
//Kreirati i klasu Disciplina čiji su privatni atributi:
//ime discipline
//tip discipline (Trkacka ili Skakacka)
//niz atletičara koji učestvuju u toj disciplini.

    private String disciplina;
    private String tip;
    private ArrayList<Atleticar> atleticari;

    public Disciplina() {
        this.atleticari = new ArrayList<>();
    }

    public Disciplina(String disciplina, String tip) {
        this.disciplina = disciplina;
        this.tip = tip;
        this.atleticari = new ArrayList<>();
    }

    public void dodajAtleticara (Atleticar atleticar) {
        this.atleticari.add(atleticar);
    }

    public void diskvalifikujAtleticara (String punoIme) {
        for (int i = 0; i < this.atleticari.size(); i++) {
            if (this.atleticari.get(i).getPunoIme().equals(punoIme)) {
                this.atleticari.remove(i);
            }
        }
    }
    private Atleticar najboljiRezultat () {
        if (this.atleticari.isEmpty()) {
            return null;
        }
        Atleticar najbolji = this.atleticari.get(0);
        for (Atleticar atleticar : this.atleticari) {
            if (atleticar.daLiJeRezultatBolji(najbolji)) {
                najbolji = atleticar;
            }
        }
        return najbolji;
    }

    public void printNajboljiRezultat () {
        System.out.println("Disciplina: " + this.disciplina);
        System.out.println("Tip: " + this.tip);
        System.out.println("Najbolji takmicar u ovoj disciplini je: ");
        najboljiRezultat().print();
        System.out.println();
    }
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public ArrayList<Atleticar> getAtleticari() {
        return atleticari;
    }

    public void setAtleticari(ArrayList<Atleticar> atleticari) {
        this.atleticari = atleticari;
    }
}
