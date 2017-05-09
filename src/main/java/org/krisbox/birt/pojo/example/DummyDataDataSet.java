package org.krisbox.birt.pojo.example;

import org.krisbox.birt.pojo.example.data.Ages;
import org.krisbox.birt.pojo.example.data.FavFood;
import org.krisbox.birt.pojo.example.data.Names;
import org.krisbox.birt.pojo.example.data.Vehicles;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class DummyDataDataSet {
    private Ages ages;
    private FavFood favFood;
    private Names names;
    private Vehicles vehicles;

    public DummyDataDataSet() {
        ages     = new Ages();
        favFood  = new FavFood();
        names    = new Names();
        vehicles = new Vehicles();
    }

    public void setAges(Ages ages){
        this.ages = ages;
    }

    public void setFavFood(FavFood favFood) {
        this.favFood = favFood;
    }

    public void setNames(Names names) {
        this.names = names;
    }

    public Ages getAges() {
        return ages;
    }

    public FavFood getFavFoods() {
        return favFood;
    }

    public Names getNames() {
        return names;
    }

    public Vehicles getVehicles() {
        return vehicles;
    }

    public List<Object> getAllData() {
        List<Object> dummyData = new ArrayList<Object>();
        dummyData.add(ages);
        dummyData.add(favFood);
        dummyData.add(names);
        dummyData.add(vehicles);

        return dummyData;
    }
}
