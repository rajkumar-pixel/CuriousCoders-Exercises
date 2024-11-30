import java.util.Scanner;

class Main3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input firstName, lastName, and n
        System.out.println("Enter the firstName:");
        String firstName = scan.nextLine();
        System.out.println("Enter the lastName:");
        String lastName = scan.nextLine();
        System.out.println("Enter the value of n:");
        int n = scan.nextInt();

        // Print fullName n times
        String fullName = firstName + lastName;
        for (int i = 0; i < n; i++) {
            System.out.println(fullName);
        }
    }
}
