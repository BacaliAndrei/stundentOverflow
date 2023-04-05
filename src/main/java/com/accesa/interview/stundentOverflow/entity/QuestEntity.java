package com.accesa.interview.stundentOverflow.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "quest")
public class QuestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer questId;
    @Column
    private Integer questValue;
    @Column
    private String questDescription;
    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private UserEntity user;
    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private CategoryEntity category;



    public QuestEntity(Integer questId, Integer questValue, String questDescription) {
        this.questId = questId;
        this.questValue = questValue;
        this.questDescription = questDescription;
    }

    public QuestEntity() {

    }
}
