package com.planifcarbon.backend.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class StationTest extends Assertions {
    @ParameterizedTest
    @CsvSource({"S1,1,2", "S2,0,0", "S3,-1,0", "Nation,0,180", "StO,0,-180", "PtChap,90,-180"})
    public void testStation(String name, double la, double lo) {
        Station s = new Station(name, la, lo);
        assertEquals(name, s.getName());
        assertEquals(la, s.getCoordinates().getLatitude());
        assertEquals(lo, s.getCoordinates().getLongitude());
    }

    @ParameterizedTest
    @CsvSource({"S1,1,2"})
    public void testIsInMetro(String name, double la, double lo) {
        Station s = new Station(name, la, lo);
        assertTrue(s.isInMetro());
    }
}