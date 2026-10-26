package com.example.SpringModulesExploration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String home() {
        return "Spring Framework Modules Exploration is Running!";
    }

    @GetMapping("/modules")
    public String modules() {
        return """
                Spring Framework Modules

                1. Core Container
                2. Data Access / JDBC
                3. Web / MVC
                4. H2 Database
                """;
    }
}