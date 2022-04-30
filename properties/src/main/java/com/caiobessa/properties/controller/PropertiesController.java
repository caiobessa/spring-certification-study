package com.caiobessa.properties.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesController {

    @Value("${person.name}")
    private String name;

    @GetMapping("/")
    public ResponseEntity<String> getStatus(){
        return ResponseEntity.ok(name);
    }
}
