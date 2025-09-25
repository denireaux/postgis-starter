package com.postgis.postgis.service;

import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Point;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.postgis.postgis.LocationController;
import com.postgis.postgis.LocationRepository;

import com.postgis.postgis.Location;

public class LocationService {

    // --- This method is used for the /save-test endpoint in the LocationController ---
    // --- This random Location will then be query'd in the /get-locations GetMapping ---
    public static String saveRandomLocation(LocationRepository locationRepository, GeometryFactory geometryFactory) {
        final Logger log = LoggerFactory.getLogger(LocationController.class);

        // Below will generate the latitude and longitude that will
        // be saved into a Point object
        double lat = 25 + Math.random() * 25;
        double lon = -125 + Math.random() * 30;

        // Create the Point with the lat and long
        Point point = geometryFactory.createPoint(new Coordinate(lon, lat)); 

        // Make the location
        Location location = new Location("Test Location", point);

        // Save the location
        locationRepository.save(location);

        // Log the save
        log.info("Saved the random location {}", location);

        // Notify the save
        return "Saved location: " + location.getName() +
               " (" + lon + ", " + lat + ")";
    }
    
}
