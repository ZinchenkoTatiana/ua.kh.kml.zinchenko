package ua.kh.kml.zinchenko;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Таня on 01.10.2015.
 */
 public class Array_Linked {
    private static final int count = 100 * 1000;

    public static void testBeg(List list) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
            list.remove(0);
        }
        time = System.currentTimeMillis() - time;
        System.out.println("начало " +
                list.getClass().getSimpleName() + " время " + time);
    }

    public static void testMid(List list) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.add(count / 2, new Object());
            list.remove(count / 2);
        }
        time = System.currentTimeMillis() - time;
        System.out.println("средина   " +
                list.getClass().getSimpleName() + " время " + time);
    }

    public static void testEnd(List list) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            list.add(new Object());
            list.remove(count);
        }
        time = System.currentTimeMillis() - time;
        System.out.println("конец       " +
                list.getClass().getSimpleName() + " время " + time);
    }

    public static void main(String[] args) {
        List ar = new ArrayList();
        List lin = new LinkedList();
        for (int i = 0; i < count; i++) {
            ar.add(i);
        }
        testBeg(ar);
        testBeg(lin);
        testMid(ar);
        testMid(lin);
        testEnd(ar);
        testEnd(lin);
    }
}
