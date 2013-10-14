package sda.main;

import sda.sorting.Bubble;
import sda.sorting.MergeSort;

/**
 * User: Alin-Desktop
 * Date: 9/20/13
 * Time: 9:29 PM
 */
public class MainRunner {
    public static void main(String[] args) {
        new Bubble().Stuff();
        System.out.println("test");

        MergeSort mergeSort = new MergeSort();

        int[] toMerge = new int[]{1, 3, 2, 5, 9};
        mergeSort.merge(toMerge, 0, 2, 4);
    }
}
