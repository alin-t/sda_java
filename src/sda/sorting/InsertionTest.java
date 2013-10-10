package sda.sorting;

import org.junit.Test;
import org.junit.Assert;

/**
 * Created with IntelliJ IDEA.
 * User: alin
 * Date: 10/10/13
 * Time: 7:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class InsertionTest {

    @Test(expected = Exception.class)
    public void testDoSortReturnsNullWhenEmptyArray() throws Exception {
        Insertion insertion = new Insertion(null);

        insertion.doSort();
    }

    @Test
    public void testDoSortReturnArrayWhenOnly1Element() {
        Insertion insert = new Insertion(new int[]{1});
        insert.doSort();
        Assert.assertEquals(1, insert.getData().length);
        Assert.assertEquals(1, insert.getData()[0]);
    }

    // 1 3 5 2 6 9
    @Test
    public void testDoSortArray() {
        Insertion insert = new Insertion(new int[]{9, 6, 5, 3, 2, 1});
        insert.doSort();
        Assert.assertEquals(6, insert.getData().length);
        Assert.assertEquals(1, insert.getData()[0]);
        Assert.assertEquals(2, insert.getData()[1]);
    }

    @Test
    public void testGetData() throws Exception {

    }
}
