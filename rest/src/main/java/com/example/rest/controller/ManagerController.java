package com.example.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.rest.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.rest.entity.Manager;
import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    @PostMapping("/managers")
    public Manager createManager(@RequestBody Manager manager) {
        return managerService.createManager(manager);

    }

    @GetMapping("/managers")
    public List<Manager> getAllManagers() {
        return managerService.getAllManagers();
    }

}
