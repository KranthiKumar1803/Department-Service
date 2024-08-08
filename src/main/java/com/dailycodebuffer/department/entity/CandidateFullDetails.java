package com.dailycodebuffer.department.entity;

/*
Todo : fields for  @CandidateFullDetails

 */

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class CandidateFullDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   // @Column(name = "id", nullable = false)
    private Long id;

    private String firstName;
    private String lastName;
    private int age;

    // todo try to set address field in a new java object STring that accomodates more Content

}
