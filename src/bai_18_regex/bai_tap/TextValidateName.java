package bai_18_regex.bai_tap;

public class TextValidateName {
    public static void main(String[] args) {
        String[] name=new String[]{"C0318G","C0321H"};
        String[] name2=new String[]{"M0231G","P0232A"};
        for (int i = 0; i < name.length; i++) {
            boolean isValidate=ValidateNameClass.validateName(name[i]);
            System.out.println("name is "+ name[i] + " is valid " +isValidate);
        }

        System.out.println("name 2: ");
        for (int i = 0; i < name2.length; i++) {
            boolean isValidate=ValidateNameClass.validateName(name2[i]);
            System.out.println("name is "+ name2[i] + " is valid " +isValidate);
        }
    }
}
