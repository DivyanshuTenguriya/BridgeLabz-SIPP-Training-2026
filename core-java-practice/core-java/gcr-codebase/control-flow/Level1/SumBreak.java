import java.util.Scanner;

public class SumBreak {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double total = 0;

        while (true) {

            System.out.print("Enter Number: ");
            double number = sc.nextDouble();

            if (number <= 0) {
                break;
            }

            total += number;
        }

        System.out.println("Total Sum = " + total);
    }
}