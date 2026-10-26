package com.example.P4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModuleController {

    @GetMapping("/modules")
    public String modules() {
        return "Spring Core, Data Access, and Web modules configured successfully!";
    }
}