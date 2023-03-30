package com.csi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @GetMapping

    public ResponseEntity<String> sayHi() {
        return ResponseEntity.ok("Welcome To fintech CSI");
    }

    @GetMapping("/address")
    public ResponseEntity<String> sayAddress() {
        return ResponseEntity.ok("Pune Nigdi");
    }

    @GetMapping("/services")
    public ResponseEntity<String> sayServices() {
        return ResponseEntity.ok("Softewere devlopment");
    }
}
