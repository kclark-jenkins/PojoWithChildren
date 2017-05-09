package org.krisbox.birt.pojo.example;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class DummyData {
    Iterator<DummyDataDataSet> iterator;
    private DummyDataDataSet   dataset = new DummyDataDataSet();

    public Object next() {
        if (iterator.hasNext()) {
            return iterator.next();
        }
        return null;
    }

    public void close() {
    }

    public void open(Object appContext, Map<String, Object> dataSetParamValues) {
    }

    public List<Object> getDummyData(Map<String, Object> dataSetParamValues) {
        return dataset.getAllData();
    }
}
