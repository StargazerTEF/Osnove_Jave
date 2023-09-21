package d18_09_2023.Zadatak2;

public class PasswordValidator extends Validator {
//Kreirati klasu PasswordValidator koja nasledjuje klasu Validator i koja ima:
//Atribut password
//Geter i seter za password
//Password je validan ukoliko:
//Sadrzi jedan od sledecih karaktera @ # / *
//Ima minimum 8 karaktera
//Sadrzi bar jedno veliko slovo (izguglajte kako ovo da proverite)
//Koristan link
//Sadrzi bar jedno malo slovo
//Sadrzi bar jedan cifru. Koristan link, idite na kraj stranice to je najslicnije resenje onom iznad
//	Ukoliko se npr za password unese vrednost botcamp
//	Metoda vraca rezultat sa greskama:
//Password must contain at least one uppercase letter
//Password must contain at least one special character @, # or *
//Password must be minimum 8 characters
//Password must contain at least one digit

    private String password;

    public PasswordValidator() {
    }

    @Override
    public ValidationResult validationResult() {
        ValidationResult vr = new ValidationResult();
        if (!this.password.contains("@") || !this.password.contains("#") || !this.password.contains("*")) {
            vr.addError("Password must contain at least one special character @, # or *");
        } if (this.password.length() < 8) {
            vr.addError("Password must be minimum 8 characters");
        }
        int i = 0;
        boolean containsUpperCase = false;
        while (!containsUpperCase && i < this.password.length()) {
            if (Character.isUpperCase(this.password.charAt(i))) {
                containsUpperCase = true;
            }
            i++;
        }
        if (!containsUpperCase) {
            vr.addError("Password must contain at least one uppercase letter");
        }

//        int counter = 0;
//        for (int i = 0; i < this.password.length(); i++) {
//            if (Character.containsUpperCase(this.password.charAt(i))) {
//                counter++;
//            }
//        }
//        if (counter > 0) {
//            vr.addError("Password must contain at least one uppercase letter");
//        }

        int j = 0;
        boolean containDigit = false;
        while (!containDigit && j < this.password.length()) {
            if (Character.isDigit(this.password.charAt(j))) {
                containDigit = true;
            }
            j++;
        }
        if (!containDigit) {
            vr.addError("Password must contain at least one digit");
        }

//        for (int i = 0; i < this.password.length(); i++) {
//            if (!Character.isDigit(this.password.charAt(i))) {
//                vr.addError("Password must contain at least one digit");
//            }
//        }
        return vr;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
