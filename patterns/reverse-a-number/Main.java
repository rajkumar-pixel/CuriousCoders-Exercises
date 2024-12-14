/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int rev = 0;
        while (n > 0) {
            int l = n % 10; 
            rev = rev * 10 + l; // Append it to the reversed number
            n = n / 10; // Remove the last digit from the number
        }

        // Print the reversed number
        System.out.println("Reversed number: " + rev);
    }
}

