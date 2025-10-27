package com.example.practiceHibernate.service;

import com.example.practiceHibernate.module.StudentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentRepo extends JpaRepository<StudentInfo,Long> {
}
