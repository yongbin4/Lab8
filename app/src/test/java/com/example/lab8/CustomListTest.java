package com.example.lab8;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     * create a mocklist for my citylist * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>()); return list;
    }
    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }
    @Test
    public void hasCityTest(){
        list = MockCityList();
        City city = new City("Estevan", "SK");
        list.addCity(city);
        assertTrue( list.hasCity(city));
    }
    @Test
    public void testDelete() {
        list = MockCityList();
        City city = new City("Estevan", "SK");
        list.addCity(city);
        list.delete(city);
        assertFalse(list.hasCity(city));
    }

    @Test
    public void countTest() {
        list = MockCityList();
        list.addCity(new City("Estevan", "SK"));
        int cityCount = list.countCities();
        assertEquals(cityCount, list.getCount());
    }



}
