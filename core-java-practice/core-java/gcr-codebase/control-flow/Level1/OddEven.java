import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Natural Number: ");
        int number = sc.nextInt();

        if (number < 1) {
            System.out.println("Not a Natural Number");
        } else {

            for (int i = 1; i <= number; i++) {

                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }

            }
        }
    }
}