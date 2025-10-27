package com.example.practiceHibernate.service;


import com.example.practiceHibernate.module.laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepo extends JpaRepository<laptop,Long> {
}
