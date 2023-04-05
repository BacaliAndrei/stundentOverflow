package com.accesa.interview.stundentOverflow.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity(name = "answer")
public class AnswerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String answerDescription;
    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private UserEntity user;

}
