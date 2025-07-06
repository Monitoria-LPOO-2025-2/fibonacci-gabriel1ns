package solution;  // Do not change it

/**
 * A Fibonacci calculator that computes Fibonacci numbers using proper
 * object-oriented design.
 * The Fibonacci sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
 * Where F(0) = 0, F(1) = 1, and F(n) = F(n-1) + F(n-2) for n > 1
 */
public class Fibonacci {

    public Fibonacci() {
        // Default constructor
        // Do not change it
    }

    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int a = 0;
        int b = 1;
        int resultado = 0;

        for (int i = 2; i <= n; i++) {
            resultado = a + b;
            a = b;
            b = resultado;
        }

        return b;
    }
}
