import java.util.Scanner;
public class midlibgames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); {
            String adjective1;
            String adjective2;
            String noun1;
            String verb1;
            String adjective3;
            
            System.out.print("Enter an adjective (description): ");
            adjective1=scanner.nextLine();
            System.out.print("Enter an adjective (description): ");
            adjective2=scanner.nextLine();
            System.out.print("Enter an adjective (description): ");
            adjective3=scanner.nextLine();
            System.out.print("Enter a noun (animal or person): ");
            noun1=scanner.nextLine();
            System.out.print("Enter a verb (action): ");
            verb1=scanner.nextLine();
            
            System.out.println("Today I went to the zoo. I saw a " + adjective1 + " " + noun1 + " jumping up and down in its tree. He " + verb1 + " through the large tunnel that led to its " + adjective2 + " " + adjective3 + ".");
        }
    }
}
