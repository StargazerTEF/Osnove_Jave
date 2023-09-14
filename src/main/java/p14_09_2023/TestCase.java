package p14_09_2023;

import java.util.ArrayList;

public class TestCase {
    private int id;
    private String naziv;
    private ArrayList<TestStep> koraci;

    public TestCase(int id, String naziv) {
        this.id = id;
        this.naziv = naziv;
        this.koraci = new ArrayList<>();
    }
    public void addStep (TestStep newStep) {
        this.koraci.add(newStep);
    }
    public int failedTests () {
        int counter = 0;
        for (int i = 0; i < this.koraci.size(); i++) {
            if (!this.koraci.get(i).validate()) {
                counter++;
            }
        }
        return counter;
    }
    public String stanjeTestCase () {
        if (this.failedTests() == 0) {
            return "PASSED";
        }
        return "FAILED";
    }
    public void print () {
        System.out.println(this.id + " - " + this.naziv);
        for (int i = 0; i < this.koraci.size(); i++) {
            this.koraci.get(i).print();
        }
        System.out.println(this.koraci.size() + " / " + this.failedTests());
        System.out.println("TEST CASE " + this.stanjeTestCase());
    }
}
