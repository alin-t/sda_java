package sda.sorting;

/**
 * Created with IntelliJ IDEA.
 * User: alin-lucian.taranu
 * Date: 10/10/13
 * Time: 10:14 AM
 * To change this template use File | Settings | File Templates.
 */
public class Insertion implements ISort {
    private int[ ] data;

    public Insertion(int[] dataToSort) {
        data = dataToSort;
    }
    @Override
    public void doSort() {

    }

    public int[] getData() {
        return data;
    }
}
