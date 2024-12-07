package com.klef.jfsd.springboot.controller;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.repository.AdminRepository;
import com.klef.jfsd.springboot.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin(origins = "http://localhost:3000")
public class AdminController {

    @Autowired
    private AdminService adminService; 
      
    @Autowired
    private AdminRepository adminRepository;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Admin admin) {
        Admin foundAdmin = adminRepository.findByEmail(admin.getEmail());

        if (foundAdmin != null && foundAdmin.getPassword().equals(admin.getPassword())) {
            // If login is successful
            return ResponseEntity.ok().body("Admin login successful");
        } else {
            // If login fails due to invalid credentials
            return ResponseEntity.status(401).body("Invalid email or password");
        }
    }
}
