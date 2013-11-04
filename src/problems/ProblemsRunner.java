package problems;

/**
 * User: alin-lucian.taranu
 * Date: 10/14/13
 * Time: 3:38 PM
 */
public class ProblemsRunner {

    public static void main(String[] args) {
        String toReverse = "Madam, I'm Adam";

        // System.out.println(ReverseString.reverse(toReverse));

        /*
        for(int i = 0; i < 20; i++)
            System.out.print(Fibonacci.fib(i) + ", ");
        System.out.println(Fibonacci.fib(20));
        */

        // System.out.println(StringPatternMatching.match("test1", "one test two"));

        int[][] result = MatrixMultiplier.multiply(new int[][]{{0, 1}}, new int[][]{{0, 1}});

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
