import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ages
        System.out.print("Enter Amar's Age: ");
        int amarAge = sc.nextInt();

        System.out.print("Enter Akbar's Age: ");
        int akbarAge = sc.nextInt();

        System.out.print("Enter Anthony's Age: ");
        int anthonyAge = sc.nextInt();

        // Heights
        System.out.print("Enter Amar's Height: ");
        double amarHeight = sc.nextDouble();

        System.out.print("Enter Akbar's Height: ");
        double akbarHeight = sc.nextDouble();

        System.out.print("Enter Anthony's Height: ");
        double anthonyHeight = sc.nextDouble();

        // Youngest
        if (amarAge < akbarAge && amarAge < anthonyAge) {
            System.out.println("Youngest Friend: Amar");
        } else if (akbarAge < amarAge && akbarAge < anthonyAge) {
            System.out.println("Youngest Friend: Akbar");
        } else {
            System.out.println("Youngest Friend: Anthony");
        }

        // Tallest
        if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
            System.out.println("Tallest Friend: Amar");
        } else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight) {
            System.out.println("Tallest Friend: Akbar");
        } else {
            System.out.println("Tallest Friend: Anthony");
        }
    }
}