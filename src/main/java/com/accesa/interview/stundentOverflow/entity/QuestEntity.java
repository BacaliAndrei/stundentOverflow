package com.accesa.interview.stundentOverflow.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
public class QuestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer questId;
    @Column
    private Integer questValue;
    @Column
    private String questDescription;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private UserEntity user;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @MapKey(name = "categoryId")
    private List<CategoryEntity> categories; //TODO: Many - to many (nice to have)
    @OneToOne
    private AnswerEntity correctAnswer;

    public QuestEntity(Integer questId, Integer questValue, String questDescription, List<CategoryEntity> categories) {
        this.questId = questId;
        this.questValue = questValue;
        this.questDescription = questDescription;
        this.categories = categories;
    }

    public QuestEntity() {

    }
}
