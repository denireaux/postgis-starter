package com.postgis.postgis;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class AoiController {
    private final JdbcTemplate jdbcTemplate;

    public AoiController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/aoi")
    public List<Map<String, Object>> getAois() {
        return jdbcTemplate.queryForList("SELECT * FROM aoi LIMIT 10");
    }
}
