package problems;

/**
 * User: alin-lucian.taranu
 * Date: 11/4/13
 * Time: 2:59 PM
 */
public class MatrixMultiplier {

    public static int[][] multiply(int[][] first, int[][] second) {
        int firstLength = first.length;
        int firstHeight = first[0].length;

        int secondLength = second.length;
        int secondHeight = second[0].length;

        int[][] result = new int[firstLength][secondHeight];

        for(int i=0; i < firstLength; i++) {

            for(int j=0; j < secondLength; j++) {
                result[i][j] = 0;
                for(int k = 0; k < firstHeight; k++) {
                    result[i][j] += first[i][k] * second[k][j];
                }
            }
        }

        return result;
    }
}
