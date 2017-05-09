package org.krisbox.birt.pojo.example.data;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public class Vehicles {
    private final String[]   data;
    private Iterator<String> itr;

    public Vehicles() {
        data = new String[]{"Prius", "Mini Cooper", "Shoelace Express", "Proxy"};
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
