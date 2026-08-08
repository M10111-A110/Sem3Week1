import java.util.Scanner;


public class Problem1{

    public static void checkDuplicateSeats(int[] seatNumbers) {
        boolean foundDuplicate = false;
        boolean[] alreadyReported = new boolean[seatNumbers.length];

        for (int i = 0; i < seatNumbers.length; i++) {
            if (alreadyReported[i]) continue;
            for (int j = i + 1; j < seatNumbers.length; j++) {
                if (seatNumbers[i] == seatNumbers[j]) {
                    System.out.println("Duplicate Seat Number Found: " + seatNumbers[i]);
                    foundDuplicate = true;
                    alreadyReported[j] = true;
                    break;
                }
            }
        }

        if (!foundDuplicate) {
            System.out.println("No Duplicate Seats Found");
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i=0; i<5; i++){
            arr[i] = scan.nextInt();
        }

        checkDuplicateSeats(arr);

        scan.close();
    }
}