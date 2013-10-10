package sda.sorting;

/**
 * Created with IntelliJ IDEA.
 * User: alin-lucian.taranu
 * Date: 10/10/13
 * Time: 10:14 AM
 * To change this template use File | Settings | File Templates.
 */
public class Insertion implements ISort {
    private int[] data;

    public Insertion(int[] dataToSort) {
        data = dataToSort;
    }

    // 1 3 5 2 6 9
    @Override
    public int[] doSort() {
        if(data == null) throw new ArithmeticException("null data to sort");

        for (int forward = 1; forward < data.length; forward++) {
            int current = data[forward];

            int backward = forward-1;
            while(backward > 0 && data[backward] > current) {
                data[backward+1] = data[backward];
                backward--;
            }

            data[backward+1] = current;
        }

        return data;
    }

    public int[] getData() {
        return data;
    }
}
