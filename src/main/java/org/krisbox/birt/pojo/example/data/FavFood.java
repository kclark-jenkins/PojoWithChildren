package org.krisbox.birt.pojo.example.data;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public class FavFood {
    private Map<String, String[]> data;
    private Iterator<Map<String, String[]>> itr;

    public FavFood() {
        data.put("Jenny",  new String[]{"Tacos", "Cake", "Wine"});
        data.put("Connor", new String[]{"Cookies", "Ice Cream", "Cheese", "Hot Dogs"});
        data.put("Kris",   new String[]{"Pizza", "Beer", "Pizza with Beer", "Beer with Pizza"});
        data.put("TBD",    new String[]{"TBD"});
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


    public String[] getFavFoods(String name) {
        return data.get(name);
    }
}
