import java.util.Scanner;

public class Problem4 {
    static void analyzeInventory(int[] sectionA, int[] sectionB) {
        int totalA = 0, totalB = 0;
        for (int qty : sectionA) totalA += qty;
        for (int qty : sectionB) totalB += qty;

        String status = (totalA == totalB) ? "Balanced" : "Not Balanced";

        int maxQty = sectionA[0];
        String maxSection = "Section A";
        int maxIndex = 0;

        for (int i = 0; i < sectionA.length; i++) {
            if (sectionA[i] > maxQty) {
                maxQty = sectionA[i];
                maxSection = "Section A";
                maxIndex = i;
            }
        }
        for (int i = 0; i < sectionB.length; i++) {
            if (sectionB[i] > maxQty) {
                maxQty = sectionB[i];
                maxSection = "Section B";
                maxIndex = i;
            }
        }

        System.out.println("Section A Total: " + totalA + " | Section B Total: " + totalB
                + " | Status: " + status + " | Highest Quantity: " + maxQty
                + " (" + maxSection + ", Item " + (maxIndex + 1) + ")");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items per section: ");
        int n = Integer.parseInt(sc.nextLine().trim());

        int[] sectionA = new int[n];
        int[] sectionB = new int[n];

        System.out.println("Enter " + n + " quantities for Section A (space-separated):");
        String[] partsA = sc.nextLine().trim().split("\\s+");
        for (int i = 0; i < n; i++) sectionA[i] = Integer.parseInt(partsA[i]);

        System.out.println("Enter " + n + " quantities for Section B (space-separated):");
        String[] partsB = sc.nextLine().trim().split("\\s+");
        for (int i = 0; i < n; i++) sectionB[i] = Integer.parseInt(partsB[i]);

        analyzeInventory(sectionA, sectionB);
        sc.close();
    }
}
