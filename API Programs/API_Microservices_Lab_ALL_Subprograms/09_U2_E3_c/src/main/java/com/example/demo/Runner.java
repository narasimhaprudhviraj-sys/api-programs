package com.example.demo;
import com.example.demo.service.EmployeeService; import org.springframework.boot.CommandLineRunner; import org.springframework.context.annotation.Bean; import org.springframework.stereotype.Component;
@Component public class Runner { @Bean CommandLineRunner run(EmployeeService s){return a->System.out.println(s.show());} }