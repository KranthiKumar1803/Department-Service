package com.dailycodebuffer.department.entity;

import jakarta.persistence.Entity;
import lombok.*;
import org.springframework.data.annotation.Id;
import java.util.Date;


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
