package org.krisbox.birt.pojo.example.data;

import java.util.Arrays;
import java.util.Iterator;

public class Ages {
    private final Integer[] data;
    private Iterator<Integer> itr;

    public Ages() {
        data = new Integer[]{29,31,2,-22};
        itr = Arrays.asList(data).iterator();
    }

    public Object next() {
        if (itr.hasNext()) {
            return itr.next();
        }
        return null;
    }

    public void close() {
    }
}
