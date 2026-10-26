package com.example.demo;
import org.springframework.web.bind.annotation.*;
@RestController public class HelloController { @GetMapping("/test") public String test(){return "Project Configured Successfully";} }