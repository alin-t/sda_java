package sda.sorting;

/**
 * User: Alin-Desktop
 * Date: 8/30/13
 * Time: 8:49 PM
 */
public class Insertion implements ISort {
    private int[] data;

    public Insertion(int[] dataToSort) {
        data = dataToSort;
    }

    // 1 3 5 2 6 9
    @Override
    public int[] doSort() {
        if (data == null) throw new ArithmeticException("null data to sort");

        for (int forward = 2; forward < data.length; forward++) {
            int current = data[forward];

            int backward = forward - 1;
            while (backward >= 0 && data[backward] > current) {
                data[backward + 1] = data[backward];
                backward--;
            }

            data[backward + 1] = current;
        }

        return data;
    }

    public int[] getData() {
        return data;
    }
}
