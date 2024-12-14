/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int n = 5;
	    
	    for(int i = 1 ; i <=n ; i++){
	        for(int j = 1 ; j <= i ; j++){
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	    for(int i = 1 ; i <= n-1 ; i++){
	        for(int j = 1 ; j <= n-i+1-1 ; j++){
	            System.out.print("*");
	        }
	        System.out.println();
	    }
		
	}
}