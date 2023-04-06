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
    private Integer answerId;
    @Column
    private String answerDescription;
    @OneToOne
    private UserEntity user; //TODO: remove many to one -> 1 answer has 1 author (user)
    @OneToOne
    private QuestEntity quest;

    public AnswerEntity(Integer answerId, String answerDescription, UserEntity user) {
        this.answerId = answerId;
        this.answerDescription = answerDescription;
        this.user = user;
    }

    public AnswerEntity() {

    }
}

