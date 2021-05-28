package bai_18_regex.thuc_hanh;

public class MainTextEmail {
    private static ValidateEmail validateEmail;
    public static final String [] validate=new String[]{
            "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"
    };
    public static final String[] invalidEmail = new String[] {
            "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

    public static void main(String[] args) {
        validateEmail=new ValidateEmail();
        for (String email: validate
             ) {
            boolean isValid=validateEmail.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isValid);
        }
        for (String mail: invalidEmail
             ) {
            boolean isValid=validateEmail.validate(mail);
            System.out.println("Email is " + mail +" is valid: "+ isValid);
        }
    }
}
