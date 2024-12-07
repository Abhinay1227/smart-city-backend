package com.klef.jfsd.springboot.service;

import com.klef.jfsd.springboot.model.Admin;  // Renamed to Admin

public interface AdminService {
    Admin findByEmail(String email);  // Renamed to Admin
}
