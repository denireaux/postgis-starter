package com.postgis.postgis;

import java.util.List;

import org.locationtech.jts.geom.GeometryFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.postgis.postgis.service.LocationService;

@RestController
public class LocationController {

    private final LocationRepository locationRepository;
    private final GeometryFactory geometryFactory = new GeometryFactory();
    final Logger log = LoggerFactory.getLogger(LocationController.class);

    public LocationController(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @GetMapping("/save-test")
    public String saveTestLocation() {
        return LocationService.saveRandomLocation(locationRepository, geometryFactory);
    }

    @GetMapping("/get-locations")
    public List<Location> getAllLocations() {
        return locationRepository.findAll();
    }
}
