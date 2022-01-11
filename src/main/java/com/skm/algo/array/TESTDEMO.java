package com.skm.algo.array;

import java.util.*;

/**
 * @author saroj on 8/19/2020
 */
public class TESTDEMO {
    /**
     * a={2,3,5,2,2,3,3,2,5,7,11,7,5,3,11}
     */
    public static void main(String[] args) {
        int a[] = {2,3,5,2,2,3,3,2,5,7,11,7,5,3,11,7,7};
        TESTDEMO testdemo = new TESTDEMO();
        testdemo.sortArray(a);
    }
    private void sortArray(int a[]) {
        HashMap<Integer, Integer> hm = new HashMap();
        for (int i = 0; i < a.length; i++) {
            Integer temp = hm.get(a[i]);
            System.out.println(temp);
            if (temp == null) {
                temp = 1;
            } else
                temp++;

            hm.put(a[i], temp);

        }
        System.out.println(hm);
        //sort the map by value...
        ArrayList<Map.Entry> al = new ArrayList(hm.entrySet());
        Collections.sort(al, new sortclass());
        //display... al
        for(int i=0; i<al.size();i++){
            Map.Entry entry = al.get(i);
            System.out.println(entry);
        }
    }

}
class sortclass implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Map.Entry<Integer, Integer> entry1 = (Map.Entry<Integer, Integer>)o1;
        Map.Entry<Integer, Integer> entry2 = (Map.Entry<Integer, Integer>)o2;
        return entry2.getValue().compareTo(entry1.getValue());
    }
}
