package problems;

/**
 * User: alin-lucian.taranu
 * Date: 10/14/13
 * Time: 3:31 PM
 */
public class ReverseString {
    public static String reverse(String s) {
        int length = s.length(), last = length - 1;
        char[] chars = s.toCharArray();

        for(int i = 0; i < length / 2; i++) {
            char c = chars[i];
            chars[i] = chars[last - i];
            chars[last - i] = c;
        }

        return new String(chars);
    }
}
