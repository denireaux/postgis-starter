package com.postgis.postgis;

import jakarta.persistence.*;
import org.locationtech.jts.geom.Point;

@Entity
public class Location {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    // Geometry column with SRID 4326 (WGS84, lat/long)
    @Column(columnDefinition = "geometry(Point,4326)")
    private Point coordinates;

    public Location() {}

    public Location(String name, Point coordinates) {
        this.name = name;
        this.coordinates = coordinates;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Point getCoordiantes() { return coordinates; }
    public void setCoordinates(Point coordinates) { this.coordinates = coordinates; }
    
}
