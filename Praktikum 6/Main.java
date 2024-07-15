import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean error = false;
        try {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            Email email = new Email(input);
            scanner.close();
            email.validateEmail();
        } catch (InvalidDomainException e) {
            System.out.println(e.getClass().getName()+"! "+e.getMessage());
            error = true;
        } catch (InvalidEmailException e) {
            System.out.println(e.getClass().getName()+"! "+e.getMessage());
            error = true;
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
            error = true;
        } finally {
            if(error)
            {
                System.out.println("Email string error!");
            } else
            {
                System.out.println("true\n"+"Email validated.");
            }
            System.out.println("Operation finished.");
        }
    }
}
