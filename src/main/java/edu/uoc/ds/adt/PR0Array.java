package edu.uoc.ds.adt;

import java.util.Arrays;

public class PR0Array {

    public final int MAXLENGTH = 50;

    private int[] array;

    public PR0Array() {
        newArray();
    }

    public void newArray() {
        array = new int[MAXLENGTH];
    }

    public void fillArray() {
        int index= 0;
        for (int c = 0; c < 100; c++) {
            if (c % 2 == 0) {
                array[index]=Integer.valueOf(c);
                index=index+1;
            }
        }
    }

    public String clearAllArray() {
        int i=0;
        StringBuilder sb = new StringBuilder();
        while (i<=array.length-1) {
            sb.append(array[i]).append(" ");
            i = i + 1;
        }
        array= null;

        return sb.toString();
    }

    public Integer getIndexOf(Integer n) {
        for (int c = 0; c < array.length; c++) {
            if (array[c] == n) {
                return c;
            }
        }
        return -1;
    }

    public Integer binarySearch(Integer n){
        Arrays.sort(array);
        int mid_place= Math.round(array.length / 2);
        int first_element= 0;
        int last_element= array.length - 1;
        int iter=0;

        while( first_element <= last_element ){
            iter=iter+1;
            if ( array[mid_place] < n ){
                first_element = mid_place + 1;
            }else if ( array[mid_place] == n ){
                return mid_place;
            }else{
                last_element = mid_place - 1;
            }
            mid_place = Math.round((first_element + last_element)/2);
        }
        if ( first_element > last_element ){
            return -1;
        }


        return -1;
    }


    public int[]  getArray() {
        return this.array;
    }
}
