# Command Line Interface...
## Get into your Running, Containerize PostGIS container and conenct to the database
```
docker exec -it e8428167f7f1 psql -U myuser -d mydb
SELECT PostGIS_Full_Version();
```

### Database actions

### Shows the location table
```
\d location
```

### Inserts a point manually
```
INSERT INTO location (name, coordinates)
VALUES (
  'Denver',
  ST_SetSRID(ST_MakePoint(-104.9903, 39.7392), 4326)
);
```

### Queries the point back
```
SELECT id, name, ST_AsText(coordinates) FROM location;
```


# Via Springboot... 
## POST
```
curl -X POST "http://localhost:8080/locations?name=Denver&lat=39.7392&lng=-104.9903"
```

## GET
```
curl http://localhost:8080/locations
```
