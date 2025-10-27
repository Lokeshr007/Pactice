package com.example.practiceHibernate.module;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

@Table(name = "studentsinfo")
public class StudentInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

     @Embedded
     private FullName fullname;

    @Transient
    private String rollnol;


    @Column(name = "Email",unique = true)
    private String email;

//    @OneToMany(mappedBy = "stud" ,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//    private List<laptop> lap;
}
