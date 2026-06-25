import java.util.Scanner;

public class NaturalSumWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Natural Number: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Not a Natural Number");
        } else {

            int sum = 0;
            int i = 1;

            while (i <= n) {
                sum += i;
                i++;
            }

            int formula = n * (n + 1) / 2;

            System.out.println("Sum using While Loop = " + sum);
            System.out.println("Sum using Formula = " + formula);

            if (sum == formula) {
                System.out.println("Both results are correct.");
            } else {
                System.out.println("Results are different.");
            }
        }
    }
}