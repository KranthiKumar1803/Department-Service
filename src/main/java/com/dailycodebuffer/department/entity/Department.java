package com.dailycodebuffer.department.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;
//import org.springframework.data.annotation.Id;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    private String departmentName;
    private String departmentAdress;
    private String departmentCode;

    private Date joinedDate;

//    @OneToMany(targetEntity=Department.class, fetch= FetchType.EAGER)
//    private List<CandidateFullDetails> candidateFullDetailsList;

}
