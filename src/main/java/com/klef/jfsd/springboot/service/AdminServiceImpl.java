package com.klef.jfsd.springboot.service;

import com.klef.jfsd.springboot.model.Admin;  // Renamed to Admin
import com.klef.jfsd.springboot.repository.AdminRepository;  // Renamed to AdminRepository
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service  // This annotation registers the class as a Spring bean
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository repository;  // Renamed to AdminRepository

    @Override
    public Admin findByEmail(String email) {  // Renamed to Admin
        return repository.findByEmail(email);  // Renamed to Admin
    }
}
