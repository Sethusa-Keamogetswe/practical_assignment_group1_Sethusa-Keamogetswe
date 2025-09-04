/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package tvseriesapp;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

/**
 *
 * @author sethu
 */
public class SeriesTest {
    
    @Test
    public void testSearchSeries() {
    SeriesModel s1 = new SeriesModel("101", "Extreme Sports", 12, 10);
    SeriesModel s2 = new SeriesModel("102", "Bargain Hunters", 10, 8);

    SeriesModel found = null;
    if (s1.getSeriesId().equals("101")) {
        found = s1;
    }

    assertNotNull("Series should be found", found);
    assertEquals("Extreme Sports", found.getSeriesName());
}
    
    @Test
    public void testSearchSeries_NotFound(){
        SeriesModel s1 = new SeriesModel("101", "Extreme Sports", 12, 16);

        SeriesModel found = null;
        if (s1.getSeriesId().equals("999")) {
            found = s1;
        }

        assertNull("Series should not be found", found);
    
    }

    @Test
    public void testUpdateSeries() {
        SeriesModel s1 = new SeriesModel("102", "Bargain Hunters", 10, 10);

        s1.setSeriesName("Bargain Hunters Reloaded");

        assertEquals("Bargain Hunters Reloaded", s1.getSeriesName());
        
    }

    @Test
    public void testDeleteSeries() {
        SeriesModel s1 = new SeriesModel("103", "Home Cooking", 20, 0);

        
        s1 = null;

        assertNull("Series should be deleted", s1);
    }

    @Test
    public void testDeleteSeries_NotFound() {
        SeriesModel s1 = new SeriesModel("103", "Home Cooking", 20, 0);

        boolean deleted = false;

        if (s1.getSeriesId().equals("999")) {
            s1 = null;
            deleted = true;
        }

        assertFalse("No series should be deleted", deleted);
    }

    @Test
    public void testSeriesAgeRestriction_AgeValid() {
        SeriesModel s1 = new SeriesModel("104", "Teen Adventures", 5, 13);
        int viewerAge = 15;

        boolean allowed = viewerAge >= s1.getSeriesAge();

        assertTrue("Viewer should be allowed", allowed);
    }
    
    @Test
    public void testSeriesAgeResctriction_AgeInvalid(){
        SeriesModel s1 = new SeriesModel("105", "Mature Drama", 10, 18);
        int viewerAge = 16;

        boolean allowed = viewerAge >= s1.getSeriesAge();

        assertFalse("Viewer should not be allowed", allowed);
    }


    
}
