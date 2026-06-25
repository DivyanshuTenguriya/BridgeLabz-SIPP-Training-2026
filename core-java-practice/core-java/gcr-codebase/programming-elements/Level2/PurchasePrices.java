import java.util.Scanner;

public class PurchasePrices {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Unit Price: ");
        double unitPrice = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR "
                + totalPrice + " if the quantity "
                + quantity + " and unit price is INR "
                + unitPrice);
    }
}