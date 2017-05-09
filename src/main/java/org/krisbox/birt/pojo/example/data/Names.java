package org.krisbox.birt.pojo.example.data;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public class Names {
    private final String[] data;
    private Iterator<String> itr;

    public Names() {
        data    = new String[]{"Jenny", "Kris", "Connor", "TBD"};
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

    public void open(Object appContext, Map<String, Object> dataSetParamValues) {
    }
}
