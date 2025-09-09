import java.util.Scanner;

public class PasswordStrength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (isStrong(password))
            System.out.println("Password strength: Strong");
        else if (isMedium(password))
            System.out.println("Password strength: Medium");
        else
            System.out.println("Password strength: Weak");
    }

    public static boolean isStrong(String pwd) {
        return pwd.length() >= 8 && pwd.matches(".*[A-Z].*") && pwd.matches(".*[a-z].*")
                && pwd.matches(".*\\d.*") && pwd.matches(".*[^a-zA-Z0-9].*");
    }

    public static boolean isMedium(String pwd) {
        return pwd.length() >= 6 && pwd.matches(".*[A-Z].*") && pwd.matches(".*[a-z].*")
                && pwd.matches(".*\\d.*");
    }
}
