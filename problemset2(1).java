import java.util.Scanner;

class Main1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input x and y
        System.out.println("Enter the value of x:");
        int x = scan.nextInt();
        System.out.println("Enter the value of y:");
        int y = scan.nextInt();

        // Print x y times
        for (int i = 0; i < y; i++) {
            System.out.println(x);
        }
    }
}
