import java.util.Scanner;

class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the value of x:");
        int x = scan.nextInt();

        for (int i = 1; i * x <= 1000; i++) {
            System.out.println(i * x);
        }
    }
}
