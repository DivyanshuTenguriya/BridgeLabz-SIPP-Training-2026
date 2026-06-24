class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {

    static void processPayment(double billAmount, double availableFunds)
            throws InsufficientFundsException {

        if (availableFunds < billAmount) {
            throw new InsufficientFundsException(
                    "Payment Failed: Insufficient funds. Required ₹" +
                            billAmount + ", Available ₹" + availableFunds);
        }

        System.out.println("Payment Successful!");
    }

    public static void main(String[] args) {

        try {
            int totalBill = 5000;
            int items = 0;
            int averageCost = totalBill / items;

            System.out.println("Average Cost: " + averageCost);

        } catch (ArithmeticException e) {
            System.out.println(
                    "Error: Bill cannot be calculated because the number of items is zero.");
        }

        try {
            String[] patients = {"Amit", "Riya", "Raj"};
            int patientIndex = 5;

            System.out.println("Patient: " + patients[patientIndex]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                    "Error: Invalid patient index. Patient record does not exist.");
        }

        try {
            String input = "12A5";
            int amount = Integer.parseInt(input);

            System.out.println("Amount: " + amount);

        } catch (NumberFormatException e) {
            System.out.println(
                    "Error: Invalid numeric input. Please enter a valid number.");
        }

        try {
            double billAmount = 10000;
            double availableFunds = 7000;

            processPayment(billAmount, availableFunds);

        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Hospital Billing System continues running safely.");
    }
}