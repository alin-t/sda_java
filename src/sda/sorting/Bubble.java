package sda.sorting;

/**
 * User: Alin-Desktop
 * Date: 8/30/13
 * Time: 8:49 PM
 */
public class Bubble implements ISort {
    private int[] set;

    public Bubble(int[] set) {
        this.set = set;
    }

    @Override
    public int[] doSort() {

        for (int i = 0; i < set.length; i++) {
            for (int j = set.length - 1; i < j; j--) {
                if (set[i] > set[j]) {
                    int tmp = set[i];
                    set[i] = set[j];
                    set[j] = tmp;
                }
            }
        }

        return set;
    }
}
