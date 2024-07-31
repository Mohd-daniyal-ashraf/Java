import java.util.Scanner;
class array_in_java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[32];

        System.out.println("Enter 5 integers:");

        for (int i = 0; i < 5; i++) {
            number[i] = scanner.nextInt();
        }

        System.out.println("You entered:");
        for (int i = 0; i < 5; i++) {
            System.out.print(number[i] + " ");
        }
        scanner.close();
    }
}
