package com.example.rest.service;

import com.example.rest.entity.Manager;
import java.util.List;

public interface ManagerService {

    List<Manager> getAllManagers();

    Manager createManager(Manager manager);
}
