package d18_09_2023.Zadatak2;

public class EmailValidator extends Validator {
//Kreirati klasu EmailValidator koja nasledjuje klasu Validator i koja ima:
//Atribut email
//Geter i seter za email
//Email je validan ukoliko ispunjava sledece uslove:
//Email mora da sadrzi @
//Email mora da se zavrsava na .com ili .net
//Ukoliko email ne ispunjava uslove vratiti rezultat sa greskom “Email is invalid”

    private String email;

    public EmailValidator() {

    }
    @Override
    public ValidationResult validationResult() {
        ValidationResult vr = new ValidationResult();
        if (!this.email.contains("@") || !this.email.endsWith(".com") || !this.email.endsWith(".net")) {
            vr.addError("Email is invalid");
        }
        return vr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
