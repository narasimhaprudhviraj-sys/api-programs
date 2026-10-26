package com.example.demo;
import org.springframework.web.bind.annotation.*;
@RestController public class ModuleController { @GetMapping("/modules") public String modules(){ return "Core Container: IoC and DI | Data Access/Integration: JDBC, ORM, OXM, JMS, Transactions | Web: MVC/WebFlux"; } }