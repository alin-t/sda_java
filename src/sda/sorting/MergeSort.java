package sda.sorting;

/**
 * Created with IntelliJ IDEA.
 * User: alin
 * Date: 10/12/13
 * Time: 11:26 PM
 */
public class MergeSort implements ISort {

    @Override
    public int[] doSort() {
        return new int[0];  //To change body of implemented methods use File | Settings | File Templates.
    }

    // 0 4 8
    public void merge(int[] set, int left, int middle, int right) {
        System.out.println(String.format("merge: left: %s ; middle: %s ; right: %s", left, middle, right));
        int leftSize = middle - left + 1;
        int rightSize = right - middle;

        int[] leftSet = new int[leftSize];
        int[] rightSet = new int[rightSize];

        for (int i = 0; i < leftSize; i++) {
            leftSet[i] = set[left + i];
        }
        for (int j = 0; j < rightSize; j++) {
            rightSet[j] = set[middle + j + 1];
        }

        int i = 0, j = 0;

        for (int current = left; current <= right; current++) {
            if (i < leftSize && (j >= rightSize || leftSet[i] < rightSet[j])) {
                set[current] = leftSet[i++];
            } else {
                set[current] = rightSet[j++];
            }
        }
    }

    public void mergeSort(int[] set, int left, int right, String message) {
        System.out.println(String.format("mergeSort: (%s) left: %s ; right: %s", message, left, right));
        if (left < right) {

            int middle = (right + left) / 2;

            mergeSort(set, left, middle, "left");
            mergeSort(set, middle + 1, right, "right");
            merge(set, left, middle, right);
        }
    }
}
