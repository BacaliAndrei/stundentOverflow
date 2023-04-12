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
@Entity
public class AnswerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer answerId;
    @Column
    private String answerDescription;
    @OneToOne
    private UserEntity user;
    @OneToOne
    private QuestEntity quest;

    public AnswerEntity(Integer answerId, String answerDescription ) {
        this.answerId = answerId;
        this.answerDescription = answerDescription;

    }

    public AnswerEntity() {

    }
}

