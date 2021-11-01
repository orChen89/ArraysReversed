import java.util.Scanner;

public class ArraysReversed {

    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

            System.out.println("Please enter the array length: ");

        final int[] numberOfArr = new int[SCANNER.nextInt()];

            System.out.println("Please enter the array values: ");

        for (int i = 0; i < numberOfArr.length; i++) {
            numberOfArr[i] = SCANNER.nextInt();
        }

            System.out.print("The values of the user array are: ");

        for (int i = 0; i < numberOfArr.length; i++) {
            System.out.print(" "+ numberOfArr[i]);

        }
            System.out.println();
            System.out.println("The values of the user array in reversed are: ");

        for (int j = numberOfArr.length - 1; j >= 0; j--){
            System.out.print(" "+ numberOfArr[j]);
        }
    }
}





