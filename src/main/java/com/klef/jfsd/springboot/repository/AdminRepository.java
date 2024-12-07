package com.klef.jfsd.springboot.repository;

import com.klef.jfsd.springboot.model.Admin;  // Renamed to Admin
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Integer> {  // Renamed to AdminRepository
    
    // Method to find admin by email
    Admin findByEmail(String email);  // Renamed to Admin
}
