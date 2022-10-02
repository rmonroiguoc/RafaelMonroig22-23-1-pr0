package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR0ArrayTest {

    PR0Array pr0Array;

    @Before
    public void setUp() {
        this.pr0Array = new PR0Array();
        this.pr0Array.fillArray();

        assertNotNull(this.pr0Array.getArray());
    }

    @After
    public void release() {
        this.pr0Array = null;
    }


    @org.junit.Test
    public void arrayTest() {
        this.pr0Array.fillArray();
        int[] v = this.pr0Array.getArray();
        assertEquals(0, v[0]);
        assertEquals(2, v[1]);
        assertEquals(4, v[2]);
        assertEquals(6, v[3]);
        assertEquals(8, v[4]);
        assertEquals(10, v[5]);
        assertEquals(12, v[6]);
        assertEquals(50, v[25]);
        assertEquals(80, v[40]);
        assertEquals(98, v[49]);

        assertEquals(this.pr0Array.clearAllArray(), new String("0 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50 52 54 56 58 60 62 64 66 68 70 72 74 76 78 80 82 84 86 88 90 92 94 96 98 "));

    }

    @org.junit.Test
    public void searchArray() {
        this.pr0Array.fillArray();
        int index = this.pr0Array.getIndexOf(41);
        assertEquals(-1, index);
        index = this.pr0Array.getIndexOf(14);
        assertEquals(7, index);
        index = this.pr0Array.getIndexOf(48);
        assertEquals(24, index);

    }

    @org.junit.Test
    public void binarySearchArray() {
        this.pr0Array.fillArray();
        int index = this.pr0Array.binarySearch(41);
        assertEquals(-1, index);
        index = this.pr0Array.binarySearch(14);
        assertEquals(7, index);
    }

}
