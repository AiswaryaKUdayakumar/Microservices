package com.UST.interviewschedule.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="interview_tabl")
public class interview {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String emailid;
    private String phnum;
    private String skills;
    private int experience;
    private String date;
    private String time;
    private String link;
    private String poc;
}