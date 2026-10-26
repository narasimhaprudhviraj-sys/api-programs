package com.example.demo;
import org.springframework.web.bind.annotation.*;
@RestController public class PortalController { @GetMapping("/") public String home(){return "Spring MVC Web Application";} @GetMapping("/greet") public String greet(@RequestParam(defaultValue="Aditya Learner") String name){return "Hello, "+name;} }