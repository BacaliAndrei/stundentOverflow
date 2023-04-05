package com.accesa.interview.stundentOverflow.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity(name="category")
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;
    @Column
    private String categoryName;
    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @MapKey(name = "questId")
    private QuestEntity quest;

    public CategoryEntity(Integer categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public CategoryEntity() {

    }
}
