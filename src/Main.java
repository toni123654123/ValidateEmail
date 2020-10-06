public class Main {

    public static void main(String[] args) {
        String st = "tuan@gmail.com";
       ValidateEmail validateEmail = new ValidateEmail();
        System.out.println(validateEmail.validate(st));
    }
}
