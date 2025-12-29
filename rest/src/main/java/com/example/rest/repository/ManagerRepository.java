package com.example.rest.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.rest.entity.Manager;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, Long> {

}
