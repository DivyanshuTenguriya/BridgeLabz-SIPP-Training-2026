import java.util.*;

public class WarehouseStock {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of products");
        int p=sc.nextInt();
        int[] stock = new int[p];
        for(int i=0;i<p;i++){
            stock[i]=sc.nextInt();
        }
        int max = stock[0];
        int min = stock[0];
        int total = 0;
        for (int item : stock) {
            if (item > max) {
                max = item;
            }
            if (item < min) {
                min = item;
            }
            total += item;
        }
        System.out.println("Maximum Stock: " + max);
        System.out.println("Minimum Stock: " + min);
        System.out.println("Total Stock: " + total);
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int item : stock) {
            if (!seen.add(item)) {
                duplicates.add(item);
            }
        }
        System.out.println("Duplicate Quantities: " + duplicates);
        int k = 2;
        int n = stock.length;
        k = k % n;
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = stock[i];
        }
        System.out.print("Rotated Stock Array: ");
        for (int item : rotated) {
            System.out.print(item + " ");
        }
        int[][] shelf = {
                {10, 20, 30},
                {40, 50, 60}
        };
        int rows = shelf.length;
        int cols = shelf[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = shelf[i][j];
            }
        }
        System.out.println("\n\nTransposed Shelf Grid:");
        for (int[] row : transpose) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
