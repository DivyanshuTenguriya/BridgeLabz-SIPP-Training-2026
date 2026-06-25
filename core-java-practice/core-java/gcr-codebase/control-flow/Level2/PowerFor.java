import java.util.Scanner;

public class PowerFor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        System.out.print("Enter Power: ");
        int power = sc.nextInt();

        if (number < 0 || power < 0) {
            System.out.println("Enter positive integers only.");
        } else {

            int result = 1;

            for (int i = 1; i <= power; i++) {
                result *= number;
            }

            System.out.println(number + "^" + power + " = " + result);
        }
    }
}