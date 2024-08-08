package com.dailycodebuffer.department.entity;

import lombok.*;
import org.springframework.context.annotation.Bean;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Department {

    @Id
    //@GeneratedValue
    private String departmentId;
    private String departmentName;
    private String departmentAdress;
    private String departmentCode;

    private Date joinedDate;

//    @OneToMany(targetEntity=Department.class, fetch= FetchType.EAGER)
//    private List<CandidateFullDetails> candidateFullDetailsList;

}
