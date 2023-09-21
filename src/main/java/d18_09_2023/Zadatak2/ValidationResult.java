package d18_09_2023.Zadatak2;

import java.util.ArrayList;

public class ValidationResult {
//Krerati klasu ValidationResult koja ima:
//hasErrors- koji moze da bude true ili false
//Errors - niz strigova
//Gettere za atribute
//Metodu addError koja postavlja hasErrors na true i dodaje gresku u niz.
//Metodu print koja stampa u formatu:
//Ako greske postoje, svaku gresku stampamo u novom redu
//Ukoliko ne postoje, stampamo “No validation errors”

    private boolean hasErrors;
    private ArrayList<String> errors;

    public ValidationResult() {
        this.errors = new ArrayList<>();
    }

    public void addError (String error) {
        this.hasErrors = true;
        errors.add(error);
    }
    public void print () {
        if (this.hasErrors) {
            for (int i = 0; i < this.errors.size(); i++) {
                System.out.println(this.errors.get(i));
            }
        } else {
            System.out.println("No validation errors.");
        }
    }

    public boolean isHasErrors() {
        return hasErrors;
    }

    public ArrayList<String> getErrors() {
        return errors;
    }
}
