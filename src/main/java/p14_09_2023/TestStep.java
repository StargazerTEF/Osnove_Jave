package p14_09_2023;

public class TestStep {
    private String opis;
    private String actual;
    private String expected;
    private String errorMessage;

    public TestStep(String opis, String actual, String expected, String errorMessage) {
        this.opis = opis;
        this.actual = actual;
        this.expected = expected;
        this.errorMessage = errorMessage;
    }

    public boolean validate () {
        return this.actual.equals(this.expected);
    }
    public void print () {
        System.out.println("| " + this.opis + " |");
        if (validate()) {
            System.out.println("| Status: passed |");
        } else {
            System.out.println("| Status: failed | " + this.errorMessage);
        }
    }
    public String getOpis() {
        return opis;
    }

    public String getActual() {
        return actual;
    }

    public String getExpected() {
        return expected;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

}
