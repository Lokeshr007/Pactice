package com.example.practiceHibernate.module;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class laptop {

    @Id
    private long id;

    private  String brand;
    private double price;

//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "stud_id")
//    private StudentInfo stud;

}
