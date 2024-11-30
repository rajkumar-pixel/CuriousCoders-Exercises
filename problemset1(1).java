import java.util.Scanner;

class Main1 {
    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner scan = new Scanner(System.in);

        // Take integer input
        System.out.println("Enter an integer:");
        int num = scan.nextInt();

        // To consume the leftover newline character
        scan.nextLine();

        // Take string input
        System.out.println("Enter a string:");
        String str = scan.nextLine();

        // Take char input
        System.out.println("Enter a character:");
        char ch = scan.next().charAt(0);

        // Print the outputs
        System.out.println(num);
        System.out.println(str);
        System.out.println(ch);
    }
}
