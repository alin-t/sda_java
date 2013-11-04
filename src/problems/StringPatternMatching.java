package problems;

/**
 * User: alin-lucian.taranu
 * Date: 11/4/13
 * Time: 11:14 AM
 */
public class StringPatternMatching {
    public static int match(String toSearch, String into) {
        int i, j;
        int m, n;

        m = toSearch.length();
        n = into.length();

        for(i = 0; i < (n-m); i++){
            j = 0;
            while((j < m) && (into.charAt(i+j) == toSearch.charAt(j))) {
                j++;
            }

            if(j == m) return i;
        }

        return -1;
    }
}
