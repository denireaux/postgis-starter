package com.postgis.postgis;

import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Point;
import org.locationtech.jts.geom.Coordinate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/locations")
public class LocationController {

    private final LocationRepository repo;
    private final GeometryFactory geometryFactory = new GeometryFactory();

    public LocationController(LocationRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Location> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Location create(@RequestParam String name,
                           @RequestParam double lat,
                           @RequestParam double lng) {
        Point point = geometryFactory.createPoint(new Coordinate(lng, lat));
        point.setSRID(4326); // TODO: Align this with database
        Location loc = new Location(name, point);
        return repo.save(loc);
    }
}
