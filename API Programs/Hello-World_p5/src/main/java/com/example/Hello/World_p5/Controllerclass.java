package com.example.Hello.World_p5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllerclass {
@GetMapping("/hello")
public String hello() {
return "Hello World using Spring Boot!";
}
}
