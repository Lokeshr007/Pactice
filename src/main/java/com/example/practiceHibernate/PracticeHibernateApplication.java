package com.example.practiceHibernate;

import com.example.practiceHibernate.module.FullName;
import com.example.practiceHibernate.module.StudentInfo;
import com.example.practiceHibernate.module.laptop;
import com.example.practiceHibernate.service.LaptopRepo;
import com.example.practiceHibernate.service.studentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeHibernateApplication implements CommandLineRunner {

    @Autowired
    studentRepo repo;

    @Autowired
    LaptopRepo repo2;
	public static void main(String[] args) {
		SpringApplication.run(PracticeHibernateApplication.class, args);
	}


    @Override
    public void run(String... args){
        FullName f = new FullName();
        f.setFirstname("Loki");
        f.setLastname("r");

        StudentInfo s= new StudentInfo();
        s.setEmail("lokesh@gmail.com");
        s.setFullname(f);
        s.setRollnol("Es22cs64");


        laptop l = new laptop();
        l.setId(51);
        l.setBrand("Lenovo");
        l.setPrice(564);

        l.setId(52);
        l.setBrand("Lenovo");
        l.setPrice(500);

        repo2.save(l);

        System.out.println(l.toString());
    }

}
