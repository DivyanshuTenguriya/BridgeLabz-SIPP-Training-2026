public class KingdomsTaxSystem {
    public static void main(String[] args) {
        double[] incomes = {5000, 12000, 25000, 60000, 8000,
                45000, 70000, 9500, 30000, 100000};
        double totalTax = 0;
        System.out.println("Citizen Tax Details:\n");
        for (int i = 0; i < incomes.length; i++) {
            double income = incomes[i];
            double tax = 0;
            String bracket = "";
            if (income < 10000) {
                tax = income * 0.05;
                bracket = "5% Tax Bracket";
            }
            else if (income <= 50000) {
                tax = income * 0.15;
                bracket = "15% Tax Bracket";
            }
            else {
                tax = income * 0.30;
                bracket = "30% Tax Bracket";
            }
            totalTax += tax;
            System.out.println("Citizen " + (i + 1));
            System.out.println("Income: " + income);
            System.out.println("Bracket: " + bracket);
            System.out.println("Tax Amount: " + tax);
            }
            System.out.println("Total Tax Collected = " + totalTax);
        }
}
