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

    public void merge(int[] set, int left, int middle, int right) {
        int leftSize = middle - left + 1;
        int rightSize = right - middle;

        int[] leftSet = new int[leftSize];
        int[] rightSet = new int[rightSize];

        for (int i = 1; i < leftSize; i++) {
            leftSet[i] = set[left + i - 1];
        }
        for (int j = 1; j < rightSize; j++) {
            rightSet[j] = set[middle + j];
        }

        int i = 0, j = 0;

        for (int current = left; current < right; current++) {
            if (leftSet[i] < rightSet[j]) {
                set[current] = leftSet[i];
                i++;
            }
            if (rightSet[j] < leftSet[i]) {
                set[current] = rightSet[j];
                j++;
            }

        }
    }
}
