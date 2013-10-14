package problems;

/**
 * User: alin-lucian.taranu
 * Date: 10/14/13
 * Time: 3:38 PM
 */
public class ProblemsRunner {

    public static void main(String[] args) {
        String toReverse = "Madam, I'm Adam";

        System.out.println(ReverseString.reverse(toReverse));

        for(int i = 0; i < 20; i++)
            System.out.print(Fibonacci.fib(i) + ", ");
        System.out.println(Fibonacci.fib(20));
    }
}
