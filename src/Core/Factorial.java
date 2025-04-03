// Factorial of 5 is: 120
package Core;

public class Factorial {
    private static int result = 1;

    public static void main(String[] args) {
        
        int n = 5;
        // Using iteration
        /* 
        int factorial = 1;
        
        for (int i = 1; i <= n; i++) {
            factorial *= i; 
        }
        System.out.println("Factorial of " + n + " is: " + factorial); 
        */
        
        // Using recursion
        factorial(1, n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
    
    private static void factorial(int n, int max) {
        if (n <= max) {
            result *= n;
            factorial(n + 1, max);
        }
    
    }
}
